
package com.alig2x.ostmodern.mvp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Object implements Parcelable {


    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("schedule_urls")
    @Expose
    private List<String> scheduleUrls = new ArrayList<String>();
    @SerializedName("publish_on")
    @Expose
    private String publishOn;
    @SerializedName("quoter")
    @Expose
    private String quoter;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("language_modified_by")
    @Expose
    private java.lang.Object languageModifiedBy;
    @SerializedName("plans")
    @Expose
    private List<java.lang.Object> plans = new ArrayList<java.lang.Object>();
    @SerializedName("cached_film_count")
    @Expose
    private Integer cachedFilmCount;
    @SerializedName("modified_by")
    @Expose
    private java.lang.Object modifiedBy;
    @SerializedName("temp_id")
    @Expose
    private Integer tempId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("created_by")
    @Expose
    private java.lang.Object createdBy;
    @SerializedName("language_publish_on")
    @Expose
    private String languagePublishOn;
    @SerializedName("language_modified")
    @Expose
    private String languageModified;
    @SerializedName("has_price")
    @Expose
    private Boolean hasPrice;
    @SerializedName("set_type_url")
    @Expose
    private java.lang.Object setTypeUrl;
    @SerializedName("temp_image")
    @Expose
    private String tempImage;
    @SerializedName("film_count")
    @Expose
    private Integer filmCount;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("language_version_url")
    @Expose
    private String languageVersionUrl;
    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("lowest_amount")
    @Expose
    private java.lang.Object lowestAmount;
    @SerializedName("formatted_body")
    @Expose
    private String formattedBody;
    @SerializedName("image_urls")
    @Expose
    private List<String> imageUrls = new ArrayList<String>();
    @SerializedName("hierarchy_url")
    @Expose
    private String hierarchyUrl;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("version_number")
    @Expose
    private Integer versionNumber;
    @SerializedName("language_ends_on")
    @Expose
    private String languageEndsOn;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("items")
    @Expose
    private List<java.lang.Object> items = new ArrayList<java.lang.Object>();
    @SerializedName("language_version_number")
    @Expose
    private Integer languageVersionNumber;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("ends_on")
    @Expose
    private String endsOn;
    @SerializedName("version_url")
    @Expose
    private String versionUrl;
    @SerializedName("set_type_slug")
    @Expose
    private String setTypeSlug;

    /**
     * 
     * @return
     *     The uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The scheduleUrls
     */
    public List<String> getScheduleUrls() {
        return scheduleUrls;
    }

    /**
     * 
     * @param scheduleUrls
     *     The schedule_urls
     */
    public void setScheduleUrls(List<String> scheduleUrls) {
        this.scheduleUrls = scheduleUrls;
    }

    /**
     * 
     * @return
     *     The publishOn
     */
    public String getPublishOn() {
        return publishOn;
    }

    /**
     * 
     * @param publishOn
     *     The publish_on
     */
    public void setPublishOn(String publishOn) {
        this.publishOn = publishOn;
    }

    /**
     * 
     * @return
     *     The quoter
     */
    public String getQuoter() {
        return quoter;
    }

    /**
     * 
     * @param quoter
     *     The quoter
     */
    public void setQuoter(String quoter) {
        this.quoter = quoter;
    }

    /**
     * 
     * @return
     *     The featured
     */
    public Boolean getFeatured() {
        return featured;
    }

    /**
     * 
     * @param featured
     *     The featured
     */
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    /**
     * 
     * @return
     *     The languageModifiedBy
     */
    public java.lang.Object getLanguageModifiedBy() {
        return languageModifiedBy;
    }

    /**
     * 
     * @param languageModifiedBy
     *     The language_modified_by
     */
    public void setLanguageModifiedBy(java.lang.Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
    }

    /**
     * 
     * @return
     *     The plans
     */
    public List<java.lang.Object> getPlans() {
        return plans;
    }

    /**
     * 
     * @param plans
     *     The plans
     */
    public void setPlans(List<java.lang.Object> plans) {
        this.plans = plans;
    }

    /**
     * 
     * @return
     *     The cachedFilmCount
     */
    public Integer getCachedFilmCount() {
        return cachedFilmCount;
    }

    /**
     * 
     * @param cachedFilmCount
     *     The cached_film_count
     */
    public void setCachedFilmCount(Integer cachedFilmCount) {
        this.cachedFilmCount = cachedFilmCount;
    }

    /**
     * 
     * @return
     *     The modifiedBy
     */
    public java.lang.Object getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 
     * @param modifiedBy
     *     The modified_by
     */
    public void setModifiedBy(java.lang.Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * 
     * @return
     *     The tempId
     */
    public Integer getTempId() {
        return tempId;
    }

    /**
     * 
     * @param tempId
     *     The temp_id
     */
    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public java.lang.Object getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(java.lang.Object createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 
     * @return
     *     The languagePublishOn
     */
    public String getLanguagePublishOn() {
        return languagePublishOn;
    }

    /**
     * 
     * @param languagePublishOn
     *     The language_publish_on
     */
    public void setLanguagePublishOn(String languagePublishOn) {
        this.languagePublishOn = languagePublishOn;
    }

    /**
     * 
     * @return
     *     The languageModified
     */
    public String getLanguageModified() {
        return languageModified;
    }

    /**
     * 
     * @param languageModified
     *     The language_modified
     */
    public void setLanguageModified(String languageModified) {
        this.languageModified = languageModified;
    }

    /**
     * 
     * @return
     *     The hasPrice
     */
    public Boolean getHasPrice() {
        return hasPrice;
    }

    /**
     * 
     * @param hasPrice
     *     The has_price
     */
    public void setHasPrice(Boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    /**
     * 
     * @return
     *     The setTypeUrl
     */
    public java.lang.Object getSetTypeUrl() {
        return setTypeUrl;
    }

    /**
     * 
     * @param setTypeUrl
     *     The set_type_url
     */
    public void setSetTypeUrl(java.lang.Object setTypeUrl) {
        this.setTypeUrl = setTypeUrl;
    }

    /**
     * 
     * @return
     *     The tempImage
     */
    public String getTempImage() {
        return tempImage;
    }

    /**
     * 
     * @param tempImage
     *     The temp_image
     */
    public void setTempImage(String tempImage) {
        this.tempImage = tempImage;
    }

    /**
     * 
     * @return
     *     The filmCount
     */
    public Integer getFilmCount() {
        return filmCount;
    }

    /**
     * 
     * @param filmCount
     *     The film_count
     */
    public void setFilmCount(Integer filmCount) {
        this.filmCount = filmCount;
    }

    /**
     * 
     * @return
     *     The body
     */
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The languageVersionUrl
     */
    public String getLanguageVersionUrl() {
        return languageVersionUrl;
    }

    /**
     * 
     * @param languageVersionUrl
     *     The language_version_url
     */
    public void setLanguageVersionUrl(String languageVersionUrl) {
        this.languageVersionUrl = languageVersionUrl;
    }

    /**
     * 
     * @return
     *     The quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     * 
     * @param quote
     *     The quote
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
     * 
     * @return
     *     The lowestAmount
     */
    public java.lang.Object getLowestAmount() {
        return lowestAmount;
    }

    /**
     * 
     * @param lowestAmount
     *     The lowest_amount
     */
    public void setLowestAmount(java.lang.Object lowestAmount) {
        this.lowestAmount = lowestAmount;
    }

    /**
     * 
     * @return
     *     The formattedBody
     */
    public String getFormattedBody() {
        return formattedBody;
    }

    /**
     * 
     * @param formattedBody
     *     The formatted_body
     */
    public void setFormattedBody(String formattedBody) {
        this.formattedBody = formattedBody;
    }

    /**
     * 
     * @return
     *     The imageUrls
     */
    public List<String> getImageUrls() {
        return imageUrls;
    }

    /**
     * 
     * @param imageUrls
     *     The image_urls
     */
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    /**
     * 
     * @return
     *     The hierarchyUrl
     */
    public String getHierarchyUrl() {
        return hierarchyUrl;
    }

    /**
     * 
     * @param hierarchyUrl
     *     The hierarchy_url
     */
    public void setHierarchyUrl(String hierarchyUrl) {
        this.hierarchyUrl = hierarchyUrl;
    }

    /**
     * 
     * @return
     *     The scheduleUrl
     */
    public String getScheduleUrl() {
        return scheduleUrl;
    }

    /**
     * 
     * @param scheduleUrl
     *     The schedule_url
     */
    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    /**
     * 
     * @return
     *     The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * 
     * @param versionNumber
     *     The version_number
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * 
     * @return
     *     The languageEndsOn
     */
    public String getLanguageEndsOn() {
        return languageEndsOn;
    }

    /**
     * 
     * @param languageEndsOn
     *     The language_ends_on
     */
    public void setLanguageEndsOn(String languageEndsOn) {
        this.languageEndsOn = languageEndsOn;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<java.lang.Object> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<java.lang.Object> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The languageVersionNumber
     */
    public Integer getLanguageVersionNumber() {
        return languageVersionNumber;
    }

    /**
     * 
     * @param languageVersionNumber
     *     The language_version_number
     */
    public void setLanguageVersionNumber(Integer languageVersionNumber) {
        this.languageVersionNumber = languageVersionNumber;
    }

    /**
     * 
     * @return
     *     The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The endsOn
     */
    public String getEndsOn() {
        return endsOn;
    }

    /**
     * 
     * @param endsOn
     *     The ends_on
     */
    public void setEndsOn(String endsOn) {
        this.endsOn = endsOn;
    }

    /**
     * 
     * @return
     *     The versionUrl
     */
    public String getVersionUrl() {
        return versionUrl;
    }

    /**
     * 
     * @param versionUrl
     *     The version_url
     */
    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }

    /**
     * 
     * @return
     *     The setTypeSlug
     */
    public String getSetTypeSlug() {
        return setTypeSlug;
    }

    /**
     * 
     * @param setTypeSlug
     *     The set_type_slug
     */
    public void setSetTypeSlug(String setTypeSlug) {
        this.setTypeSlug = setTypeSlug;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uid);
        dest.writeStringList(this.scheduleUrls);
        dest.writeString(this.publishOn);
        dest.writeString(this.quoter);
        dest.writeValue(this.featured);
        dest.writeParcelable((Parcelable) this.languageModifiedBy, flags);
        dest.writeList(this.plans);
        dest.writeValue(this.cachedFilmCount);
        dest.writeParcelable((Parcelable) this.modifiedBy, flags);
        dest.writeValue(this.tempId);
        dest.writeString(this.title);
        dest.writeString(this.self);
        dest.writeParcelable((Parcelable) this.createdBy, flags);
        dest.writeString(this.languagePublishOn);
        dest.writeString(this.languageModified);
        dest.writeValue(this.hasPrice);
        dest.writeParcelable((Parcelable) this.setTypeUrl, flags);
        dest.writeString(this.tempImage);
        dest.writeValue(this.filmCount);
        dest.writeString(this.body);
        dest.writeString(this.languageVersionUrl);
        dest.writeString(this.quote);
        dest.writeParcelable((Parcelable) this.lowestAmount, flags);
        dest.writeString(this.formattedBody);
        dest.writeStringList(this.imageUrls);
        dest.writeString(this.hierarchyUrl);
        dest.writeString(this.scheduleUrl);
        dest.writeValue(this.active);
        dest.writeString(this.slug);
        dest.writeValue(this.versionNumber);
        dest.writeString(this.languageEndsOn);
        dest.writeString(this.created);
        dest.writeList(this.items);
        dest.writeValue(this.languageVersionNumber);
        dest.writeString(this.modified);
        dest.writeString(this.summary);
        dest.writeString(this.endsOn);
        dest.writeString(this.versionUrl);
        dest.writeString(this.setTypeSlug);
    }

    public Object() {
    }

    protected Object(Parcel in) {
        this.uid = in.readString();
        this.scheduleUrls = in.createStringArrayList();
        this.publishOn = in.readString();
        this.quoter = in.readString();
        this.featured = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.languageModifiedBy = in.readParcelable(java.lang.Object.class.getClassLoader());
        this.plans = new ArrayList<java.lang.Object>();
        in.readList(this.plans, java.lang.Object.class.getClassLoader());
        this.cachedFilmCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.modifiedBy = in.readParcelable(java.lang.Object.class.getClassLoader());
        this.tempId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.title = in.readString();
        this.self = in.readString();
        this.createdBy = in.readParcelable(java.lang.Object.class.getClassLoader());
        this.languagePublishOn = in.readString();
        this.languageModified = in.readString();
        this.hasPrice = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.setTypeUrl = in.readParcelable(java.lang.Object.class.getClassLoader());
        this.tempImage = in.readString();
        this.filmCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.body = in.readString();
        this.languageVersionUrl = in.readString();
        this.quote = in.readString();
        this.lowestAmount = in.readParcelable(java.lang.Object.class.getClassLoader());
        this.formattedBody = in.readString();
        this.imageUrls = in.createStringArrayList();
        this.hierarchyUrl = in.readString();
        this.scheduleUrl = in.readString();
        this.active = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.slug = in.readString();
        this.versionNumber = (Integer) in.readValue(Integer.class.getClassLoader());
        this.languageEndsOn = in.readString();
        this.created = in.readString();
        this.items = new ArrayList<java.lang.Object>();
        in.readList(this.items, java.lang.Object.class.getClassLoader());
        this.languageVersionNumber = (Integer) in.readValue(Integer.class.getClassLoader());
        this.modified = in.readString();
        this.summary = in.readString();
        this.endsOn = in.readString();
        this.versionUrl = in.readString();
        this.setTypeSlug = in.readString();
    }

    public static final Parcelable.Creator<Object> CREATOR = new Parcelable.Creator<Object>() {
        @Override
        public Object createFromParcel(Parcel source) {
            return new Object(source);
        }

        @Override
        public Object[] newArray(int size) {
            return new Object[size];
        }
    };
}
