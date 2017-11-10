
package be.neesconsulting.coco.source.eod.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class General {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Exchange")
    @Expose
    private String exchange;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("CurrencyName")
    @Expose
    private String currencyName;
    @SerializedName("CurrencySymbol")
    @Expose
    private String currencySymbol;
    @SerializedName("Sector")
    @Expose
    private String sector;
    @SerializedName("Industry")
    @Expose
    private String industry;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("FullTimeEmployees")
    @Expose
    private Integer fullTimeEmployees;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public void setFullTimeEmployees(Integer fullTimeEmployees) {
        this.fullTimeEmployees = fullTimeEmployees;
    }

}
