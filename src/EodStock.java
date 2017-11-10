
package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EodStock {

    @SerializedName("General")
    @Expose
    private General general;
    @SerializedName("Highlights")
    @Expose
    private Highlights highlights;
    @SerializedName("Earnings")
    @Expose
    private Earnings earnings;
    @SerializedName("Financials")
    @Expose
    private Financials financials;

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public Highlights getHighlights() {
        return highlights;
    }

    public void setHighlights(Highlights highlights) {
        this.highlights = highlights;
    }

    public Earnings getEarnings() {
        return earnings;
    }

    public void setEarnings(Earnings earnings) {
        this.earnings = earnings;
    }

    public Financials getFinancials() {
        return financials;
    }

    public void setFinancials(Financials financials) {
        this.financials = financials;
    }

}
