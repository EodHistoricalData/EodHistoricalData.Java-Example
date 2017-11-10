
package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Highlights {

    @SerializedName("MarketCapitalization")
    @Expose
    private Float marketCapitalization;
    @SerializedName("EBITDA")
    @Expose
    private Float eBITDA;
    @SerializedName("PERatio")
    @Expose
    private String pERatio;
    @SerializedName("PEGRatio")
    @Expose
    private String pEGRatio;
    @SerializedName("WallStreetTargetPrice")
    @Expose
    private String wallStreetTargetPrice;
    @SerializedName("BookValue")
    @Expose
    private String bookValue;
    @SerializedName("DividendShare")
    @Expose
    private String dividendShare;
    @SerializedName("DividendYield")
    @Expose
    private String dividendYield;
    @SerializedName("EarningsShare")
    @Expose
    private String earningsShare;
    @SerializedName("EPSEstimateCurrentYear")
    @Expose
    private String ePSEstimateCurrentYear;
    @SerializedName("EPSEstimateNextYear")
    @Expose
    private String ePSEstimateNextYear;
    @SerializedName("EPSEstimateNextQuarter")
    @Expose
    private String ePSEstimateNextQuarter;

    public Float getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(Float marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public Float getEBITDA() {
        return eBITDA;
    }

    public void setEBITDA(Float eBITDA) {
        this.eBITDA = eBITDA;
    }

    public String getPERatio() {
        return pERatio;
    }

    public void setPERatio(String pERatio) {
        this.pERatio = pERatio;
    }

    public String getPEGRatio() {
        return pEGRatio;
    }

    public void setPEGRatio(String pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    public String getWallStreetTargetPrice() {
        return wallStreetTargetPrice;
    }

    public void setWallStreetTargetPrice(String wallStreetTargetPrice) {
        this.wallStreetTargetPrice = wallStreetTargetPrice;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getDividendShare() {
        return dividendShare;
    }

    public void setDividendShare(String dividendShare) {
        this.dividendShare = dividendShare;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getEarningsShare() {
        return earningsShare;
    }

    public void setEarningsShare(String earningsShare) {
        this.earningsShare = earningsShare;
    }

    public String getEPSEstimateCurrentYear() {
        return ePSEstimateCurrentYear;
    }

    public void setEPSEstimateCurrentYear(String ePSEstimateCurrentYear) {
        this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
    }

    public String getEPSEstimateNextYear() {
        return ePSEstimateNextYear;
    }

    public void setEPSEstimateNextYear(String ePSEstimateNextYear) {
        this.ePSEstimateNextYear = ePSEstimateNextYear;
    }

    public String getEPSEstimateNextQuarter() {
        return ePSEstimateNextQuarter;
    }

    public void setEPSEstimateNextQuarter(String ePSEstimateNextQuarter) {
        this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
    }

}
