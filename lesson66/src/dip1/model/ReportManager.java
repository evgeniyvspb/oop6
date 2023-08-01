package dip1.model;

import java.util.List;

public class ReportManager {
    private final Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void printReport(List<ReportItem> items){
        reportable.output(items);
    }
}
