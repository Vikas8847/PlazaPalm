package com.example.plazapalm.views.confirmbookthankyou;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0002J\u000e\u0010R\u001a\u00020S2\u0006\u0010O\u001a\u00020PJ\b\u0010T\u001a\u00020SH\u0002J\u0010\u0010U\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0002J\u0016\u0010V\u001a\u00020S2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u0010X\u001a\u00020YH\u0002R(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R(\u0010\u0017\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R(\u0010\u001a\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R(\u0010\u001d\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R(\u0010\'\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R(\u0010*\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R(\u0010>\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000e\"\u0004\b@\u0010\u0010R(\u0010A\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R(\u0010D\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010\u0010R(\u0010G\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010R(\u0010J\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u0010\u00a8\u0006Z"}, d2 = {"Lcom/example/plazapalm/views/confirmbookthankyou/ConfirmBookingVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "preferenceFile", "Lcom/example/plazapalm/pref/PreferenceFile;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "addtoCalendar", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAddtoCalendar", "()Landroidx/databinding/ObservableField;", "setAddtoCalendar", "(Landroidx/databinding/ObservableField;)V", "bookingId", "getBookingId", "setBookingId", "categoryName", "getCategoryName", "setCategoryName", "chooseDate", "getChooseDate", "setChooseDate", "chooseTime", "getChooseTime", "setChooseTime", "commingFrom", "getCommingFrom", "setCommingFrom", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "description", "getDescription", "setDescription", "p_id", "getP_id", "setP_id", "postProfileId", "getPostProfileId", "setPostProfileId", "getPreferenceFile", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPreferenceFile", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "questionAnswer", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/QuestionAnswer;", "getQuestionAnswer", "()Ljava/util/ArrayList;", "setQuestionAnswer", "(Ljava/util/ArrayList;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "timePicker", "Landroid/app/TimePickerDialog;", "title", "getTitle", "setTitle", "user_Name", "getUser_Name", "setUser_Name", "user_image", "getUser_image", "setUser_image", "user_location", "getUser_location", "setUser_location", "user_miles", "getUser_miles", "setUser_miles", "addToCalendar", "Lkotlinx/coroutines/Job;", "view", "Landroid/view/View;", "confirmBooking", "onClicks", "", "openTimePicker", "removeFromCalendar", "selectDate", "observableField", "validateFields", "", "app_debug"})
public final class ConfirmBookingVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile preferenceFile;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private android.app.TimePickerDialog timePicker;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> p_id;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> user_Name;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> commingFrom;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> user_location;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> user_miles;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> user_image;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> bookingId;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> postProfileId;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> chooseDate;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> chooseTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> description;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> categoryName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> title;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> addtoCalendar;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.QuestionAnswer> questionAnswer;
    
    @javax.inject.Inject()
    public ConfirmBookingVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile preferenceFile, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.networkcalls.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPreferenceFile() {
        return null;
    }
    
    public final void setPreferenceFile(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStoreUtil() {
        return null;
    }
    
    public final void setDataStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getP_id() {
        return null;
    }
    
    public final void setP_id(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUser_Name() {
        return null;
    }
    
    public final void setUser_Name(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getCommingFrom() {
        return null;
    }
    
    public final void setCommingFrom(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUser_location() {
        return null;
    }
    
    public final void setUser_location(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUser_miles() {
        return null;
    }
    
    public final void setUser_miles(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUser_image() {
        return null;
    }
    
    public final void setUser_image(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getBookingId() {
        return null;
    }
    
    public final void setBookingId(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPostProfileId() {
        return null;
    }
    
    public final void setPostProfileId(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getChooseDate() {
        return null;
    }
    
    public final void setChooseDate(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getChooseTime() {
        return null;
    }
    
    public final void setChooseTime(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getAddtoCalendar() {
        return null;
    }
    
    public final void setAddtoCalendar(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.QuestionAnswer> getQuestionAnswer() {
        return null;
    }
    
    public final void setQuestionAnswer(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.QuestionAnswer> p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final kotlinx.coroutines.Job confirmBooking(android.view.View view) {
        return null;
    }
    
    private final void openTimePicker() {
    }
    
    private final void selectDate(androidx.databinding.ObservableField<java.lang.String> observableField) {
    }
    
    private final boolean validateFields() {
        return false;
    }
    
    private final kotlinx.coroutines.Job addToCalendar(android.view.View view) {
        return null;
    }
    
    private final kotlinx.coroutines.Job removeFromCalendar(android.view.View view) {
        return null;
    }
}