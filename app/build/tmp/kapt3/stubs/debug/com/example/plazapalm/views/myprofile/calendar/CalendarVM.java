package com.example.plazapalm.views.myprofile.calendar;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020,2\u0006\u0010&\u001a\u00020,J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010$\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#\u00a8\u00060"}, d2 = {"Lcom/example/plazapalm/views/myprofile/calendar/CalendarVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "dataStore", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "adapterCalendar", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/CalenderData;", "getAdapterCalendar", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "adapterCalendar$delegate", "Lkotlin/Lazy;", "booking_id", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getBooking_id", "()Landroidx/databinding/ObservableField;", "calendarBookingList", "Ljava/util/ArrayList;", "getCalendarBookingList", "()Ljava/util/ArrayList;", "setCalendarBookingList", "(Ljava/util/ArrayList;)V", "click", "Landroidx/databinding/ObservableBoolean;", "getClick", "()Landroidx/databinding/ObservableBoolean;", "month", "Landroidx/databinding/ObservableInt;", "getMonth", "()Landroidx/databinding/ObservableInt;", "p_Id", "getP_Id", "year", "getYear", "deleteBooking", "Lkotlinx/coroutines/Job;", "getCalanderDataMonthWise", "", "", "onClicks", "view", "Landroid/view/View;", "app_debug"})
public final class CalendarVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.networkcalls.Repository repository;
    private com.example.plazapalm.pref.PreferenceFile pref;
    private com.example.plazapalm.datastore.DataStoreUtil dataStore;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.CalenderData> calendarBookingList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapterCalendar$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> p_Id = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> booking_id = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableInt month = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableInt year = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean click = null;
    
    @javax.inject.Inject()
    public CalendarVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.CalenderData> getCalendarBookingList() {
        return null;
    }
    
    public final void setCalendarBookingList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.CalenderData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.CalenderData> getAdapterCalendar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getP_Id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getBooking_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableInt getMonth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableInt getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteBooking() {
        return null;
    }
    
    public final void getCalanderDataMonthWise(int month, int year) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}