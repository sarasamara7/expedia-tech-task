/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.expedia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL
 */
public class HotelsOffersHandler implements Serializable {

    public HotelsOffersHandler(String destinatioName,
            String startDate,
            String endDate,
            String stayLength,
            String minStarRate,
            String maxStarRate,
            String minTotalRate,
            String maxTotalRate,
            String minGuestRate,
            String maxGuestRate) {
        this.destinatioName = destinatioName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.stayLength = stayLength;
        this.minStarRate = minStarRate;
        this.maxStarRate = maxStarRate;
        this.minTotalRate = minTotalRate;
        this.maxTotalRate = maxTotalRate;
        this.minGuestRate = minGuestRate;
        this.maxGuestRate = maxGuestRate;
    }
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");

    /**
     * @return the testResultJSON
     */
    public HotelsResultObject GetOffers() {
        HotelsResultObject obj = new HotelsResultObject();
        try {
            String urlString = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
            if (destinatioName != null && !destinatioName.isEmpty()) {
                urlString = urlString + String.format("&destinationName=%s", destinatioName);
            }
            if (startDate != null && !startDate.isEmpty() && tryParseDateInExpediaFormat(startDate)) {
                urlString = urlString + String.format("&minTripStartDate=%s", dateFormat.parse(startDate));
            }
            if (endDate != null && !endDate.isEmpty() && tryParseDateInExpediaFormat(endDate)) {
                urlString = urlString + String.format("&maxTripStartDate=%s", dateFormat.parse(endDate));
            }
            if (stayLength != null && !stayLength.isEmpty() && tryParseInt(stayLength)) {
                urlString = urlString + String.format("&lengthOfStay=%s", stayLength);
            }
            if (minStarRate != null && !minStarRate.isEmpty() && tryParseInt(minStarRate)) {
                urlString = urlString + String.format("&minStarRating=%s", minStarRate);
            }
            if (maxStarRate != null && !maxStarRate.isEmpty() && tryParseInt(maxStarRate)) {
                urlString = urlString + String.format("&maxStarRating=%s", maxStarRate);
            }
            if (minTotalRate != null && !minTotalRate.isEmpty() && tryParseInt(minTotalRate)) {
                urlString = urlString + String.format("&minTotalRate=%s", minTotalRate);
            }
            if (maxTotalRate != null && !maxTotalRate.isEmpty() && tryParseInt(maxTotalRate)) {
                urlString = urlString + String.format("&maxTotalRate=%s", maxTotalRate);
            }
            if (minGuestRate != null && !minGuestRate.isEmpty() && tryParseInt(minGuestRate)) {
                urlString = urlString + String.format("&minGuestRating=%s", minGuestRate);
            }
            if (maxGuestRate != null && !maxGuestRate.isEmpty() && tryParseInt(maxGuestRate)) {
                urlString = urlString + String.format("&maxGuestRating=%s", maxGuestRate);
            }
            URL url = new URL(urlString);
            HttpURLConnection c = (HttpURLConnection) url.openConnection();  //connecting to url
            c.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));  //stream to resource
             
            Gson gson = new GsonBuilder().create();
            obj = gson.fromJson(in, HotelsResultObject.class);
            
            /*String str;
            while ((str = in.readLine()) != null) //reading data
            {
                testResultJSON += str + "\n";//process the response and save it in some string or so
            }*/
            
            //obj = gson.fromJson(testResultJSON, HotelsResultObject.class);

            in.close();  //closing stream
        } catch (Exception ex) {
            testResultJSON = "failure";
            obj = new HotelsResultObject();
        }

        return obj;
    }

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    boolean tryParseDateInExpediaFormat(String value) {
        try {
            dateFormat.parse(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @param testResultJSON the testResultJSON to set
     */
    public void setTestResultJSON(String testResultJSON) {
        this.testResultJSON = testResultJSON;
    }

    public class Hotel {

    }

    //private String destination;
    private String destinatioName;
    private String startDate;
    private String endDate;
    private String stayLength;
    private String minStarRate;
    private String maxStarRate;
    private String minTotalRate;
    private String maxTotalRate;
    private String minGuestRate;
    private String maxGuestRate;
    private String testResultJSON;

    /**
     * Creates a new instance of NameHandler
     */
    public HotelsOffersHandler() {
        //destination = null;
        destinatioName = "";
        startDate = "";
        endDate = "";
        stayLength = "";
        minStarRate = "";
        maxStarRate = "";
        minTotalRate = "";
        maxTotalRate = "";
        minGuestRate = "";
        maxGuestRate = "";
    }

    /*public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
     */
    /**
     * @return the destinatioName
     */
    public String getDestinatioName() {
        return destinatioName;
    }

    /**
     * @param destinatioName the destinatioName to set
     */
    public void setDestinatioName(String destinatioName) {
        this.destinatioName = destinatioName;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the stayLength
     */
    public String getStayLength() {
        return stayLength;
    }

    /**
     * @param stayLength the stayLength to set
     */
    public void setStayLength(String stayLength) {
        this.stayLength = stayLength;
    }

    /**
     * @return the minStarRate
     */
    public String getMinStarRate() {
        return minStarRate;
    }

    /**
     * @param minStarRate the minStarRate to set
     */
    public void setMinStarRate(String minStarRate) {
        this.minStarRate = minStarRate;
    }

    /**
     * @return the maxStarRate
     */
    public String getMaxStarRate() {
        return maxStarRate;
    }

    /**
     * @param maxStarRate the maxStarRate to set
     */
    public void setMaxStarRate(String maxStarRate) {
        this.maxStarRate = maxStarRate;
    }

    /**
     * @return the minTotalRate
     */
    public String getMinTotalRate() {
        return minTotalRate;
    }

    /**
     * @param minTotalRate the minTotalRate to set
     */
    public void setMinTotalRate(String minTotalRate) {
        this.minTotalRate = minTotalRate;
    }

    /**
     * @return the maxTotalRate
     */
    public String getMaxTotalRate() {
        return maxTotalRate;
    }

    /**
     * @param maxTotalRate the maxTotalRate to set
     */
    public void setMaxTotalRate(String maxTotalRate) {
        this.maxTotalRate = maxTotalRate;
    }

    /**
     * @return the minGuestRate
     */
    public String getMinGuestRate() {
        return minGuestRate;
    }

    /**
     * @param minGuestRate the minGuestRate to set
     */
    public void setMinGuestRate(String minGuestRate) {
        this.minGuestRate = minGuestRate;
    }

    /**
     * @return the maxGuestRate
     */
    public String getMaxGuestRate() {
        return maxGuestRate;
    }

    /**
     * @param maxGuestRate the maxGuestRate to set
     */
    public void setMaxGuestRate(String maxGuestRate) {
        this.maxGuestRate = maxGuestRate;
    }
}
