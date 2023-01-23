package com.example.plazapalm.views.advancesettings.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0003J\b\u0010/\u001a\u00020,H\u0002J&\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020\u0011H\u0016J\u0010\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020BH\u0016J+\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020\u000b2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020IH\u0017\u00a2\u0006\u0002\u0010JJ\u001a\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000107H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\'\u0010(\u00a8\u0006M"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/map/AdvanceMapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnPolylineClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;", "Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;", "()V", "DOT", "Lcom/google/android/gms/maps/model/PatternItem;", "GAP", "PATTERN_GAP_LENGTH_PX", "", "PATTERN_POLYLINE_DOTTED", "", "binding", "Lcom/example/plazapalm/databinding/AdvanceMapFragmentBinding;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "getMMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "marker", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerList", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/Marker;", "getMarkerList", "()Ljava/util/ArrayList;", "setMarkerList", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/example/plazapalm/views/advancesettings/map/AdvanceMapVM;", "getViewModel", "()Lcom/example/plazapalm/views/advancesettings/map/AdvanceMapVM;", "viewModel$delegate", "Lkotlin/Lazy;", "addPloyLine", "", "fetchApiKey", "getLastLocation", "onClicks", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "Landroid/location/Location;", "onMapClick", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "onMapReady", "googleMap", "onPolylineClick", "polyline", "Lcom/google/android/gms/maps/model/Polyline;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AdvanceMapFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnPolylineClickListener, com.google.android.gms.maps.GoogleMap.OnMapClickListener, com.google.android.gms.maps.LocationSource.OnLocationChangedListener {
    private final int PATTERN_GAP_LENGTH_PX = 20;
    private final com.google.android.gms.maps.model.PatternItem DOT = null;
    private final com.google.android.gms.maps.model.PatternItem GAP = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.Marker> markerList;
    private final java.util.List<com.google.android.gms.maps.model.PatternItem> PATTERN_POLYLINE_DOTTED = null;
    private com.google.android.gms.maps.model.MarkerOptions marker;
    public com.google.android.gms.maps.GoogleMap mMap;
    public com.google.android.gms.maps.SupportMapFragment mapFragment;
    private com.example.plazapalm.databinding.AdvanceMapFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AdvanceMapFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.Marker> getMarkerList() {
        return null;
    }
    
    public final void setMarkerList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.Marker> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getMMap() {
        return null;
    }
    
    public final void setMMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    private final com.example.plazapalm.views.advancesettings.map.AdvanceMapVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchApiKey() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLastLocation() {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void onClicks() {
    }
    
    @java.lang.Override()
    public void onPolylineClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Polyline polyline) {
    }
    
    private final void addPloyLine() {
    }
    
    @java.lang.Override()
    public void onMapClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
}