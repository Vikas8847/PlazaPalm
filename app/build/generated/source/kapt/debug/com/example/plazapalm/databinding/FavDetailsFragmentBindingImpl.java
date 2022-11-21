package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FavDetailsFragmentBindingImpl extends FavDetailsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvFavDetails, 11);
        sViewsWithIds.put(R.id.clFavDetails, 12);
        sViewsWithIds.put(R.id.ivFavDetails, 13);
        sViewsWithIds.put(R.id.tvFavDetailsAddress, 14);
        sViewsWithIds.put(R.id.tvFavCityAddress, 15);
        sViewsWithIds.put(R.id.tvFavDetailsDistance, 16);
        sViewsWithIds.put(R.id.clFavDetailsLikeDislike, 17);
        sViewsWithIds.put(R.id.ivFavDetailsLike, 18);
        sViewsWithIds.put(R.id.ivFavDetailsDislike, 19);
        sViewsWithIds.put(R.id.ivFavTotalLikedCounts, 20);
        sViewsWithIds.put(R.id.tvFavHeartFilledCounts, 21);
        sViewsWithIds.put(R.id.clVEditProDescription, 22);
        sViewsWithIds.put(R.id.etVEditProDescription, 23);
        sViewsWithIds.put(R.id.ivFavOfDesc1, 24);
        sViewsWithIds.put(R.id.clFavOfDesc2, 25);
        sViewsWithIds.put(R.id.tvFavOfDesc2, 26);
        sViewsWithIds.put(R.id.rvImages, 27);
        sViewsWithIds.put(R.id.clFavOfDesc3, 28);
        sViewsWithIds.put(R.id.tvFavOfDesc3, 29);
        sViewsWithIds.put(R.id.cvFavDetails, 30);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvFavDetailsDisLikeCountandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.DisLikesCount.get()
            //         is vm.DisLikesCount.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFavDetailsDisLikeCount);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
            // vm.DisLikesCount != null
            boolean vmDisLikesCountJavaLangObjectNull = false;
            // vm.DisLikesCount
            androidx.databinding.ObservableField<java.lang.String> vmDisLikesCount = null;
            // vm.DisLikesCount.get()
            java.lang.String vmDisLikesCountGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDisLikesCount = vm.getDisLikesCount();

                vmDisLikesCountJavaLangObjectNull = (vmDisLikesCount) != (null);
                if (vmDisLikesCountJavaLangObjectNull) {




                    vmDisLikesCount.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvFavDetailsLikeCountsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.LikesCount.get()
            //         is vm.LikesCount.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFavDetailsLikeCounts);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
            // vm.LikesCount != null
            boolean vmLikesCountJavaLangObjectNull = false;
            // vm.LikesCount.get()
            java.lang.String vmLikesCountGet = null;
            // vm.LikesCount
            androidx.databinding.ObservableField<java.lang.String> vmLikesCount = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmLikesCount = vm.getLikesCount();

                vmLikesCountJavaLangObjectNull = (vmLikesCount) != (null);
                if (vmLikesCountJavaLangObjectNull) {




                    vmLikesCount.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvFavDetailsNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.username.get()
            //         is vm.username.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFavDetailsName);
            // localize variables for thread safety
            // vm.username.get()
            java.lang.String vmUsernameGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
            // vm.username
            androidx.databinding.ObservableField<java.lang.String> vmUsername = null;
            // vm.username != null
            boolean vmUsernameJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUsername = vm.getUsername();

                vmUsernameJavaLangObjectNull = (vmUsername) != (null);
                if (vmUsernameJavaLangObjectNull) {




                    vmUsername.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FavDetailsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FavDetailsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[29]
            );
        this.btnBookingProfile.setTag(null);
        this.ivFavDetailsBackBtn.setTag(null);
        this.ivFavDetailsChats.setTag(null);
        this.ivFavDetailsEmptyHeart.setTag(null);
        this.ivFavDetailsFilledHeart.setTag(null);
        this.ivFavDetailsOptions.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvVideos.setTag(null);
        this.tvFavDetailsDisLikeCount.setTag(null);
        this.tvFavDetailsLikeCounts.setTag(null);
        this.tvFavDetailsName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmLikesCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmUsername((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmDisLikesCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLikesCount(androidx.databinding.ObservableField<java.lang.String> VmLikesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUsername(androidx.databinding.ObservableField<java.lang.String> VmUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDisLikesCount(androidx.databinding.ObservableField<java.lang.String> VmDisLikesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        java.lang.String vmDisLikesCountGet = null;
        java.lang.String vmLikesCountGet = null;
        com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
        java.lang.String vmUsernameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmLikesCount = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmUsername = null;
        androidx.databinding.ObservableField<java.lang.String> vmDisLikesCount = null;
        com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.ImagesVideosModel> vmVideosAdapter = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.LikesCount
                        vmLikesCount = vm.getLikesCount();
                    }
                    updateRegistration(0, vmLikesCount);


                    if (vmLikesCount != null) {
                        // read vm.LikesCount.get()
                        vmLikesCountGet = vmLikesCount.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                        // read vm.videosAdapter
                        vmVideosAdapter = vm.getVideosAdapter();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (vm != null) {
                        // read vm.username
                        vmUsername = vm.getUsername();
                    }
                    updateRegistration(1, vmUsername);


                    if (vmUsername != null) {
                        // read vm.username.get()
                        vmUsernameGet = vmUsername.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (vm != null) {
                        // read vm.DisLikesCount
                        vmDisLikesCount = vm.getDisLikesCount();
                    }
                    updateRegistration(2, vmDisLikesCount);


                    if (vmDisLikesCount != null) {
                        // read vm.DisLikesCount.get()
                        vmDisLikesCountGet = vmDisLikesCount.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.btnBookingProfile.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsChats.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsEmptyHeart.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsFilledHeart.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsOptions.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            com.example.plazapalm.utils.BindingAdapters.setRecyclerAdapter(this.rvVideos, vmVideosAdapter);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetailsDisLikeCount, vmDisLikesCountGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsDisLikeCount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsDisLikeCountandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsLikeCounts, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsLikeCountsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetailsLikeCounts, vmLikesCountGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetailsName, vmUsernameGet);
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
        flag 0 (0x1L): vm.LikesCount
        flag 1 (0x2L): vm.username
        flag 2 (0x3L): vm.DisLikesCount
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}