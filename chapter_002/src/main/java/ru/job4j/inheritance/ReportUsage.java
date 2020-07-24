package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport htmlReport = new HtmlReport();
        String htmlReportText = htmlReport.generate("Report's name", "Report's body");
        System.out.println(htmlReportText);
        JSONReport jsonReport = new JSONReport();
        String jsonReportText = jsonReport.generate("name", "body");
        System.out.println(jsonReportText);
    }
}
