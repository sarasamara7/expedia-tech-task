package org.mypackage.expedia;

import java.util.ArrayList;

public class HotelsResultObject {

    private OfferInfo offerInfo;
    private UserInfo userInfo;
    private Offers offers;

    //Getters
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public Offers getOffers() {
        return offers;
    }

    //Setters
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    public class OfferInfo {

        /**
         * @return the userSelectedCurrency
         */
        public String getUserSelectedCurrency() {
            return userSelectedCurrency;
        }

        /**
         * @param userSelectedCurrency the userSelectedCurrency to set
         */
        public void setUserSelectedCurrency(String userSelectedCurrency) {
            this.userSelectedCurrency = userSelectedCurrency;
        }

        //Getters
        public String getCurrency() {
            return currency;
        }

        public String getLanguage() {
            return language;
        }

        public String getSiteID() {
            return siteID;
        }

        //Setters
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public void setSiteID(String siteID) {
            this.siteID = siteID;
        }

        private String siteID;
        private String language;
        private String currency;
        private String userSelectedCurrency;
    }

    public class UserInfo {

        //Getters
        public String getUserId() {
            return userId;
        }

        public Persona getPersona() {
            return persona;
        }

        //Setters
        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setPersona(Persona persona) {
            this.persona = persona;
        }
        private Persona persona;
        private String userId;
    }

    public class Persona {

        public String getPersonaType() {
            return personaType;
        }

        public void setPersonaType(String personaType) {
            this.personaType = personaType;
        }
        private String personaType;
    }

    public class Offers {

        public ArrayList<Hotel> getHotel() {
            return Hotel;
        }

        public void setHotel(ArrayList<Hotel> Hotel) {
            this.Hotel = Hotel;
        }

        private ArrayList<Hotel> Hotel = new ArrayList<Hotel>();
    }

    public class Hotel {

        public OfferDateRange offerDateRange;
        public Destination destination;
        public HotelInfo hotelInfo;
        public HotelPricingInfo hotelPricingInfo;
        public HotelUrls hotelUrls;
    }

    public class OfferDateRange {

        //Getters
        public int getLengthOfStay() {
            return lengthOfStay;
        }

        public ArrayList<Integer> getTravelEndDate() {
            return travelEndDate;
        }

        public ArrayList<Integer> getTravelStartDate() {
            return travelStartDate;
        }

        //Setters
        public void setLengthOfStay(int lengthOfStay) {
            this.lengthOfStay = lengthOfStay;
        }

        public void setTravelEndDate(ArrayList<Integer> travelEndDate) {
            this.travelEndDate = travelEndDate;
        }

        public void setTravelStartDate(ArrayList<Integer> travelStartDate) {
            this.travelStartDate = travelStartDate;
        }

        private ArrayList<Integer> travelStartDate = new ArrayList<Integer>();
        private ArrayList<Integer> travelEndDate = new ArrayList<Integer>();
        private int lengthOfStay;
    }

    public class Destination {

        //Getters
        public String getNonLocalizedCity() {
            return nonLocalizedCity;
        }

        public String getTla() {
            return tla;
        }

        /**
         * @param nonLocalizedCity the nonLocalizedCity to set
         */
        public void setNonLocalizedCity(String nonLocalizedCity) {
            this.nonLocalizedCity = nonLocalizedCity;
        }

        public String getCity() {
            return city;
        }

        public String getProvince() {
            return province;
        }

        public String getCountry() {
            return country;
        }

        public String getShortName() {
            return shortName;
        }

        public String getLongName() {
            return longName;
        }

        public String getAssociatedMultiCityRegionId() {
            return associatedMultiCityRegionId;
        }

        public String getRegionID() {
            return regionID;
        }

        //Setters
        public void setTla(String tla) {
            this.tla = tla;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

        public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
            this.associatedMultiCityRegionId = associatedMultiCityRegionId;
        }

        public void setRegionID(String regionID) {
            this.regionID = regionID;
        }

        private String regionID;
        private String associatedMultiCityRegionId;
        private String longName;
        private String shortName;
        private String country;
        private String province;
        private String city;
        private String tla;
        private String nonLocalizedCity;
    }

    public class HotelInfo {

        //Getters
        public boolean isIsOfficialRating() {
            return isOfficialRating;
        }

        public boolean isVipAccess() {
            return vipAccess;
        }

        public String getHotelImageUrl() {
            return hotelImageUrl;
        }

        public int getHotelReviewTotal() {
            return hotelReviewTotal;
        }

        public double getHotelGuestReviewRating() {
            return hotelGuestReviewRating;
        }

        public String getHotelStarRating() {
            return hotelStarRating;
        }

        public double getHotelLongitude() {
            return hotelLongitude;
        }

        public double getHotelLatitude() {
            return hotelLatitude;
        }

        public String getHotelProvince() {
            return hotelProvince;
        }

        public String getHotelCity() {
            return hotelCity;
        }

        public String getHotelStreetAddress() {
            return hotelStreetAddress;
        }

        public String getHotelLongDestination() {
            return hotelLongDestination;
        }

        public String getHotelDestinationRegionID() {
            return hotelDestinationRegionID;
        }

        public String getHotelDestination() {
            return hotelDestination;
        }

        public String getLocalizedHotelName() {
            return localizedHotelName;
        }

        public String getHotelName() {
            return hotelName;
        }

        public String getHotelId() {
            return hotelId;
        }

        //Setters
        public void setIsOfficialRating(boolean isOfficialRating) {
            this.isOfficialRating = isOfficialRating;
        }

        public void setVipAccess(boolean vipAccess) {
            this.vipAccess = vipAccess;
        }

        public void setHotelImageUrl(String hotelImageUrl) {
            this.hotelImageUrl = hotelImageUrl;
        }

        public void setHotelReviewTotal(int hotelReviewTotal) {
            this.hotelReviewTotal = hotelReviewTotal;
        }

        public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
            this.hotelGuestReviewRating = hotelGuestReviewRating;
        }

        public void setHotelStarRating(String hotelStarRating) {
            this.hotelStarRating = hotelStarRating;
        }

        public void setHotelLongitude(double hotelLongitude) {
            this.hotelLongitude = hotelLongitude;
        }

        public void setHotelLatitude(double hotelLatitude) {
            this.hotelLatitude = hotelLatitude;
        }

        public String getHotelCountryCode() {
            return hotelCountryCode;
        }

        public void setHotelCountryCode(String hotelCountryCode) {
            this.hotelCountryCode = hotelCountryCode;
        }

        public void setHotelProvince(String hotelProvince) {
            this.hotelProvince = hotelProvince;
        }

        public void setHotelCity(String hotelCity) {
            this.hotelCity = hotelCity;
        }

        public void setHotelStreetAddress(String hotelStreetAddress) {
            this.hotelStreetAddress = hotelStreetAddress;
        }

        public void setHotelLongDestination(String hotelLongDestination) {
            this.hotelLongDestination = hotelLongDestination;
        }

        public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
            this.hotelDestinationRegionID = hotelDestinationRegionID;
        }

        public void setHotelDestination(String hotelDestination) {
            this.hotelDestination = hotelDestination;
        }

        public void setLocalizedHotelName(String localizedHotelName) {
            this.localizedHotelName = localizedHotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public void setHotelId(String hotelId) {
            this.hotelId = hotelId;
        }
        private String hotelId;
        private String hotelName;
        private String localizedHotelName;
        private String hotelDestination;
        private String hotelDestinationRegionID;
        private String hotelLongDestination;
        private String hotelStreetAddress;
        private String hotelCity;
        private String hotelProvince;
        private String hotelCountryCode;
        private double hotelLatitude;
        private double hotelLongitude;
        private String hotelStarRating;
        private double hotelGuestReviewRating;
        private int hotelReviewTotal;
        private String hotelImageUrl;
        private boolean vipAccess;
        private boolean isOfficialRating;
    }

    public class HotelPricingInfo {

        //Getters
        public boolean isDrr() {
            return drr;
        }

        public double getPercentSavings() {
            return percentSavings;
        }

        public String getCurrency() {
            return currency;
        }

        public double getOriginalPricePerNight() {
            return originalPricePerNight;
        }

        public double getCrossOutPriceValue() {
            return crossOutPriceValue;
        }

        public double getTotalPriceValue() {
            return totalPriceValue;
        }

        public double getAveragePriceValue() {
            return averagePriceValue;
        }

        //Setters
        public void setDrr(boolean drr) {
            this.drr = drr;
        }

        public void setPercentSavings(double percentSavings) {
            this.percentSavings = percentSavings;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setOriginalPricePerNight(double originalPricePerNight) {
            this.originalPricePerNight = originalPricePerNight;
        }

        public void setCrossOutPriceValue(double crossOutPriceValue) {
            this.crossOutPriceValue = crossOutPriceValue;
        }

        public void setTotalPriceValue(double totalPriceValue) {
            this.totalPriceValue = totalPriceValue;
        }

        public void setAveragePriceValue(double averagePriceValue) {
            this.averagePriceValue = averagePriceValue;
        }
        private double averagePriceValue;
        private double totalPriceValue;
        private double crossOutPriceValue;
        private double originalPricePerNight;
        private String currency;
        private double percentSavings;
        private boolean drr;
    }

    public class HotelUrls {

        //Getters
        public String getHotelSearchResultUrl() {
            return hotelSearchResultUrl;
        }

        public String getHotelInfositeUrl() {
            return hotelInfositeUrl;
        }

        //Setters
        public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
            this.hotelSearchResultUrl = hotelSearchResultUrl;
        }

        public void setHotelInfositeUrl(String hotelInfositeUrl) {
            this.hotelInfositeUrl = hotelInfositeUrl;
        }
        private String hotelInfositeUrl;
        private String hotelSearchResultUrl;
    }

}
