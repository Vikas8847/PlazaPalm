package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FavTempBindingImpl extends FavTempBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvFavDetails, 8);
        sViewsWithIds.put(R.id.clFavDetails, 9);
        sViewsWithIds.put(R.id.ivFavDetails, 10);
        sViewsWithIds.put(R.id.tvFavDetailsAddress, 11);
        sViewsWithIds.put(R.id.tvFavCityAddress, 12);
        sViewsWithIds.put(R.id.tvFavDetailsDistance, 13);
        sViewsWithIds.put(R.id.clFavDetailsLikeDislike, 14);
        sViewsWithIds.put(R.id.ivFavDetailsLike, 15);
        sViewsWithIds.put(R.id.tvFavDetailsLikeCounts, 16);
        sViewsWithIds.put(R.id.ivFavDetailsDislike, 17);
        sViewsWithIds.put(R.id.tvFavDetailsDisLikeCount, 18);
        sViewsWithIds.put(R.id.tvFavHeartFilledCounts, 19);
        sViewsWithIds.put(R.id.tvFavDetailsName, 20);
        sViewsWithIds.put(R.id.etVEditProDescription, 21);
        sViewsWithIds.put(R.id.ivFavOfDesc1, 22);
        sViewsWithIds.put(R.id.tvFavOfDesc2, 23);
        sViewsWithIds.put(R.id.ivFavOfDesc2, 24);
        sViewsWithIds.put(R.id.ivFavOfDesc3, 25);
        sViewsWithIds.put(R.id.vPlayer1, 26);
        sViewsWithIds.put(R.id.vPlayer2, 27);
        sViewsWithIds.put(R.id.vPlayer3, 28);
        sViewsWithIds.put(R.id.vPlayer4, 29);
        sViewsWithIds.put(R.id.vPlayer5, 30);
        sViewsWithIds.put(R.id.vPlayer6, 31);
        sViewsWithIds.put(R.id.tvFavOfDesc3, 32);
        sViewsWithIds.put(R.id.ivThirdDescription, 33);
        sViewsWithIds.put(R.id.cvFavDetails, 34);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FavTempBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private FavTempBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[34]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[25]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[33]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.cardview.widget.CardView) bindings[26]
            , (androidx.cardview.widget.CardView) bindings[27]
            , (androidx.cardview.widget.CardView) bindings[28]
            , (androidx.cardview.widget.CardView) bindings[29]
            , (androidx.cardview.widget.CardView) bindings[30]
            , (androidx.cardview.widget.CardView) bindings[31]
            );
        this.btnBookingProfile.setTag(null);
        this.ivFavDetailsBackBtn.setTag(null);
        this.ivFavDetailsChats.setTag(null);
        this.ivFavDetailsEmptyHeart.setTag(null);
        this.ivFavDetailsFilledHeart.setTag(null);
        this.ivFavDetailsOptions.setTag(null);
        this.ivFavTotalLikedCounts.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.example.plazapalm.views.favourites.favdetails.FavDetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.favourites.favdetails.FavDetailsVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vm != null) {
                    // read vm::onClicks
                    vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btnBookingProfile.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsChats.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsEmptyHeart.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsFilledHeart.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsOptions.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavTotalLikedCounts.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.favourites.favdetails.FavDetailsVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.favourites.favdetails.FavDetailsVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClicks(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}