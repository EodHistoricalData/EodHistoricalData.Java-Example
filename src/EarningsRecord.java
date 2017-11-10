package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarningsRecord {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("epsActual")
    @Expose
    private String epsActual;
    @SerializedName("epsEstimate")
    @Expose
    private String epsEstimate;
    @SerializedName("epsDifference")
    @Expose
    private String epsDifference;
    @SerializedName("surprisePercent")
    @Expose
    private String surprisePercent;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEpsActual() {
        return epsActual;
    }

    public void setEpsActual(String epsActual) {
        this.epsActual = epsActual;
    }

    public String getEpsEstimate() {
        return epsEstimate;
    }

    public void setEpsEstimate(String epsEstimate) {
        this.epsEstimate = epsEstimate;
    }

    public String getEpsDifference() {
        return epsDifference;
    }

    public void setEpsDifference(String epsDifference) {
        this.epsDifference = epsDifference;
    }

    public String getSurprisePercent() {
        return surprisePercent;
    }

    public void setSurprisePercent(String surprisePercent) {
        this.surprisePercent = surprisePercent;
    }

}