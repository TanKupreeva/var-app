package by.itstep.strs;

public class HTMLTableBuilder {
    public static final String TABLE_BEGGIN = "<table>";
    public static final String TABLE_END = "</table>";

    public static final String TABLE_ROW_BEGGIN = "<tr>";
    public static final String TABL_ROW_END = "</tr>";

    public static final String TABLE_HEADER_BEGGIN = "<th>";
    public static final String TABL_HEADER_END = "</th>";

    public static final String TABLE_DATA_BEGGIN = "<td>";
    public static final String TABL_DATA_END = "</td>";


    private StringBuilder htmlData = new StringBuilder(1024);// TODO try to calculate capacity

    public HTMLTableBuilder() {
        htmlData.append(TABLE_BEGGIN).append(TABLE_END);
    }

    public String build() {
        return htmlData.toString();
    }

    public void addHeaders(String... headers) {

        StringBuilder headersBuilder = new StringBuilder(20 * headers.length);
        headersBuilder.append(TABLE_ROW_BEGGIN);
        for (String header : headers) {
            headersBuilder.append(TABLE_HEADER_BEGGIN);
            headersBuilder.append(header);
            headersBuilder.append(TABL_HEADER_END);

        }
        headersBuilder.append(TABL_ROW_END);
        int pos = htmlData.indexOf(TABLE_BEGGIN)+TABLE_BEGGIN.length();
        htmlData.insert(pos, headersBuilder);
    }


    public void addStudents(Student... students){
        StringBuilder studentsBuilder = new StringBuilder(20 * students.length);
        for (Student st : students) {
            studentsBuilder.append(TABLE_ROW_BEGGIN);
            studentsBuilder.append(TABLE_DATA_BEGGIN).append(st.getId()).append(TABL_DATA_END);
            studentsBuilder.append(TABLE_DATA_BEGGIN).append(st.getName()).append(TABL_DATA_END);
            studentsBuilder.append(TABLE_DATA_BEGGIN).append(st.getAvg()).append(TABL_DATA_END);


            studentsBuilder.append(TABL_ROW_END);

        }

        htmlData.insert(htmlData.indexOf(TABLE_END), studentsBuilder);
    }
}
