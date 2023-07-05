package by.itstep.swing.films;


import by.itstep.oop.inh.A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilmsApp extends JFrame {

    private static Film[] db = new Film[5];
    private int i = 0;
    private static int position = 0;
    private static int filmsNumber = 0;

    private JLabel uidLbl = new JLabel("Unique ID:");
    private JLabel imdbLbl = new JLabel("IMDB Rate:");
    private JLabel nameLbl = new JLabel("Name:");
    private JLabel typeLbl = new JLabel("Type:");
    private JLabel dateLbl = new JLabel("Date:");
    private JLabel actorsLbl = new JLabel("Stars:");
    private JLabel searchLbl = new JLabel("Search:");
    private JLabel statusLbl = new JLabel("");


    private JTextField uidText = new JTextField("Unique ID:");
    private JTextField imdbText = new JTextField("IMDB Rate:");
    private JTextField nameText = new JTextField("Name:");
    private JTextField typeText = new JTextField("Type:");
    private JTextField dateText = new JTextField("Date:");
    private JTextField actorsText = new JTextField("Stars:");
    private JTextField searchText = new JTextField("");

    static {
        Actor actor1 = new Actor(123, "Will Smith");
        Actor actor2 = new Actor(324, "Martin Lawrence");
        Actor actor3 = new Actor(451, "Lisa Boyle");
        Actor[] actors = {actor1, actor2, actor3};

        Film film1 = new Film(1, 7.6, "Bad boys", "Action", new Date(), actors);


        Actor[] actors2 = {actor1, actor2};
        Film film2 = new Film(2, 7.1, "Bad boys 2", "Action", new Date(), actors2);


        Actor[] actors3 = {new Actor(4312, "Leonardo DiCaprio"), new Actor(534, "Kate Winslet"), new Actor(5464, "Billy Zane")};
        Film film3 = new Film(3, 7.9, "Titanic", "Action", new Date(), actors3);

        Actor[] actors4 = {new Actor(99, "Brendan Fraser"), new Actor(78, "Rachel Weisz"), new Actor(789, "John Hannah")};
        Film film4 = new Film(4, 7.1, "The Mummy", "Fantasy", new Date(), actors4);


        Film film5 = new Film(5, 6.4, "The Mummy Returns", "Fantasy", new Date(), actors4);


        db[0] = film1;
        db[1] = film2;
        db[2] = film3;
        db[3] = film4;
        db[4] = film5;
        filmsNumber = 5;
    }


    public FilmsApp() {


        setTitle("Films Application");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 1000);

        statusLbl.setBounds(20, 10, 320, 20);
        uidLbl.setBounds(20, 85, 120, 20);
        imdbLbl.setBounds(20, 105, 120, 20);
        nameLbl.setBounds(20, 125, 120, 20);
        typeLbl.setBounds(20, 145, 120, 20);
        dateLbl.setBounds(20, 165, 120, 20);
        actorsLbl.setBounds(20, 185, 120, 20);
        searchLbl.setBounds(20, 30, 100, 20);

        uidText.setBounds(100, 85, 250, 20);
        imdbText.setBounds(100, 105, 250, 20);
        nameText.setBounds(100, 125, 250, 20);
        typeText.setBounds(100, 145, 250, 20);
        dateText.setBounds(100, 165, 250, 20);
        actorsText.setBounds(100, 185, 250, 20);
        searchText.setBounds(70, 30, 280, 20);

        boarding(uidLbl, imdbLbl, nameLbl, typeLbl, dateLbl, actorsLbl, searchLbl, statusLbl);
        boarding(uidText, imdbText, nameText, typeText, dateText, actorsText, searchText);

// load first film


        uidText.setEditable(false);
        imdbText.setEditable(false);
        nameText.setEditable(false);
        typeText.setEditable(false);
        dateText.setEditable(false);
        actorsText.setEditable(false);


        loadFilm();


        JButton back = new JButton();
        back.setText("<back");
        back.setBounds(60, 250, 100, 30);
        add(back);
        back.setEnabled(false);

        JButton next = new JButton();
        next.setText("next>");
        next.setBounds(180, 250, 100, 30);
        add(next);

        JButton go = new JButton();
        go.setText("Go");
        go.setBounds(350, 25, 50, 30);


        JButton add = new JButton();
        add.setText("add");
        add.setBounds(320, 250, 80, 30);


        JButton remove = new JButton();
        remove.setText("remove");
        remove.setBounds(400, 250, 100, 30);


        JButton update = new JButton();
        update.setText("Update");
        update.setBounds(500, 250, 100, 30);


        JButton save = new JButton();
        update.setText("Save");
        update.setBounds(320, 250, 80, 30);
        save.setVisible(false);
        boarding(go, next, back, add, remove, update, save);


        setVisible(true);


        next.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position < filmsNumber - 1) {
                    position++;
                    back.setEnabled(true);
                    loadFilm();
                } else {
                    next.setEnabled(false);
                }
                if (position == filmsNumber - 1) {
                    next.setEnabled(false);
                }
            }

        });


        back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position > 0) {
                    position--;
                    loadFilm();
                    next.setEnabled(true);
                } else {
                    back.setEnabled(false);
                }
                if (position == 0) {
                    back.setEnabled(false);
                }
            }
        });

        remove.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(null, "Sure? You want to exit?", "Swing Tester",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    statusLbl.setText("You selected: Yes");
                } else if (result == JOptionPane.NO_OPTION) {
                    statusLbl.setText("You selected: No");
                } else {
                    statusLbl.setText("None selected");
                }

            }
        });

        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Film film = getFilm();

                // save updated object to memory
                db[position] = film;


                statusLbl.setText("Film with UID" + film.getUid() + " has been updated successfully");


            }
        });


        go.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String search = searchText.getText();
                int counter = 0;
                for (int i = 0; i < db.length; i++) {
                    if (db[i].getName().toLowerCase().contains(search.toLowerCase())) {
                        Pattern p = Pattern.compile(search.toLowerCase());
                        Matcher m = p.matcher(nameText.getText().toLowerCase());

                        while (m.find()) {
                            counter++;
                        }
                        searchText.setText(counter + " результатов");
                    }
                }
                if (counter == 0) {
                    searchText.setText("не содержится");
                }
            }


        });

        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update.setVisible(false);
                add.setVisible(false);
                save.setVisible(true);
                uidText.setEditable(true);
                imdbText.setEditable(true);
                nameText.setEditable(true);
                typeText.setEditable(true);
                dateText.setEditable(true);
                actorsText.setEditable(true);
                Film film = new Film();
                uidText.setText("");
                imdbText.setText("");
                nameText.setText("");
                typeText.setText("");
                dateText.setText("");
                actorsText.setText("");
            }
        });

        save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Film film = getFilm();

                db[filmsNumber++] = film;
                statusLbl.setText("Film with UID" + film.getUid() + " has been created successfully");

                //hide functions
                back.setEnabled(true);
                next.setEnabled(true);
                remove.setEnabled(true);
                update.setEnabled(true);
            }
        });


    }


    private void boarding(Component... components) {
        for (Component c :
                components) {
            add(c);


        }
    }

    private Film getFilm() {
        Film film = new Film();
        uidText.setEditable(true);
        imdbText.setEditable(true);
        nameText.setEditable(true);
        typeText.setEditable(true);
        dateText.setEditable(true);
        actorsText.setEditable(true);

        film.setUid(Long.parseLong(uidText.getText()));
        film.setImdbRate(Double.parseDouble(imdbText.getText()));
        film.setName(nameText.getText());
        film.setType(typeText.getText());
        film.setReleaseDate(new Date());
        Actor[] actors = new Actor[1];
        Actor actor = new Actor(actorsText.getText());
        actors[0] = actor;
        film.setActors(actors);
        return film;

    }

    private void loadFilm() {
        Film film = db[position];
        uidText.setText(db[position].getUid() + "");
        imdbText.setText(db[position].getImdbRate() + "");
        nameText.setText(db[position].getName() + "");
        typeText.setText(db[position].getType() + "");
        dateText.setText(db[position].getReleaseDate() + "");
        actorsText.setText(db[position].getActors()[0].toString() + "");
    }
}


class Tester {
    public static void main(String[] args) {
        new FilmsApp();
    }
}

