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
        sViewsWithIds.put(R.id.clFavDetails, 16);
        sViewsWithIds.put(R.id.ivFavDetails, 17);
        sViewsWithIds.put(R.id.tvFavDetailsDistance, 18);
        sViewsWithIds.put(R.id.clFavDetailsLikeDislike, 19);
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
    private androidx.databinding.InverseBindingListener tvFavDetailsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.fav_title.get()
            //         is vm.fav_title.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFavDetails);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.fav_title != null
            boolean vmFavTitleJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
            // vm.fav_title.get()
            java.lang.String vmFavTitleGet = null;
            // vm.fav_title
            androidx.databinding.ObservableField<java.lang.String> vmFavTitle = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmFavTitle = vm.getFav_title();

                vmFavTitleJavaLangObjectNull = (vmFavTitle) != (null);
                if (vmFavTitleJavaLangObjectNull) {




                    vmFavTitle.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvFavDetailsAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.tvFavDetailsAddress.get()
            //         is vm.tvFavDetailsAddress.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFavDetailsAddress);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
            // vm.tvFavDetailsAddress.get()
            java.lang.String vmTvFavDetailsAddressGet = null;
            // vm.tvFavDetailsAddress
            androidx.databinding.ObservableField<java.lang.String> vmTvFavDetailsAddress = null;
            // vm.tvFavDetailsAddress != null
            boolean vmTvFavDetailsAddressJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTvFavDetailsAddress = vm.getTvFavDetailsAddress();

                vmTvFavDetailsAddressJavaLangObjectNull = (vmTvFavDetailsAddress) != (null);
                if (vmTvFavDetailsAddressJavaLangObjectNull) {




                    vmTvFavDetailsAddress.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
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
        super(bindingComponent, root, 8
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[29]
            );
        this.btnBookingProfile.setTag(null);
        this.ivFavDetailsBackBtn.setTag(null);
        this.ivFavDetailsChats.setTag(null);
        this.ivFavDetailsDislike.setTag(null);
        this.ivFavDetailsEmptyHeart.setTag(null);
        this.ivFavDetailsFilledHeart.setTag(null);
        this.ivFavDetailsLike.setTag(null);
        this.ivFavDetailsOptions.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvVideos.setTag(null);
        this.tvFavCityAddress.setTag(null);
        this.tvFavDetails.setTag(null);
        this.tvFavDetailsAddress.setTag(null);
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
                mDirtyFlags = 0x200L;
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
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmTvFavCityAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmIsLike((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmUsername((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmIsDisLike((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeVmTvFavDetailsAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmFavTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmLikesCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeVmDisLikesCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmTvFavCityAddress(androidx.databinding.ObservableField<java.lang.String> VmTvFavCityAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsLike(androidx.databinding.ObservableBoolean VmIsLike, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUsername(androidx.databinding.ObservableField<java.lang.String> VmUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsDisLike(androidx.databinding.ObservableBoolean VmIsDisLike, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTvFavDetailsAddress(androidx.databinding.ObservableField<java.lang.String> VmTvFavDetailsAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFavTitle(androidx.databinding.ObservableField<java.lang.String> VmFavTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLikesCount(androidx.databinding.ObservableField<java.lang.String> VmLikesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDisLikesCount(androidx.databinding.ObservableField<java.lang.String> VmDisLikesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        java.lang.String vmFavTitleGet = null;
        boolean vmIsLikeGet = false;
        java.lang.String vmDisLikesCountGet = null;
        android.graphics.drawable.Drawable vmIsDisLikeIvFavDetailsDislikeAndroidDrawableIcLikeIconIvFavDetailsDislikeAndroidDrawableIcThumbsDown = null;
        com.example.plazapalm.views.favourites.favdetails.FavDetailsVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmTvFavCityAddress = null;
        android.graphics.drawable.Drawable vmIsLikeIvFavDetailsLikeAndroidDrawableIcLikeIconIvFavDetailsLikeAndroidDrawableLikeUnfilledImage = null;
        androidx.databinding.ObservableBoolean vmIsLike = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        java.lang.String vmTvFavCityAddressGet = null;
        java.lang.String vmTvFavDetailsAddressGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmUsername = null;
        androidx.databinding.ObservableBoolean vmIsDisLike = null;
        androidx.databinding.ObservableField<java.lang.String> vmTvFavDetailsAddress = null;
        java.lang.String vmLikesCountGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmFavTitle = null;
        java.lang.String vmUsernameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmLikesCount = null;
        boolean vmIsDisLikeGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmDisLikesCount = null;
        com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.ImagesVideosModel> vmVideosAdapter = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (vm != null) {
                        // read vm.tvFavCityAddress
                        vmTvFavCityAddress = vm.getTvFavCityAddress();
                    }
                    updateRegistration(0, vmTvFavCityAddress);


                    if (vmTvFavCityAddress != null) {
                        // read vm.tvFavCityAddress.get()
                        vmTvFavCityAddressGet = vmTvFavCityAddress.get();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (vm != null) {
                        // read vm.isLike
                        vmIsLike = vm.isLike();
                    }
                    updateRegistration(1, vmIsLike);


                    if (vmIsLike != null) {
                        // read vm.isLike.get()
                        vmIsLikeGet = vmIsLike.get();
                    }
                if((dirtyFlags & 0x302L) != 0) {
                    if(vmIsLikeGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read vm.isLike.get() ? @android:drawable/ic_like_icon : @android:drawable/like_unfilled_image
                    vmIsLikeIvFavDetailsLikeAndroidDrawableIcLikeIconIvFavDetailsLikeAndroidDrawableLikeUnfilledImage = ((vmIsLikeGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivFavDetailsLike.getContext(), R.drawable.ic_like_icon)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivFavDetailsLike.getContext(), R.drawable.like_unfilled_image)));
            }
            if ((dirtyFlags & 0x300L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                        // read vm.videosAdapter
                        vmVideosAdapter = vm.getVideosAdapter();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (vm != null) {
                        // read vm.username
                        vmUsername = vm.getUsername();
                    }
                    updateRegistration(2, vmUsername);


                    if (vmUsername != null) {
                        // read vm.username.get()
                        vmUsernameGet = vmUsername.get();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (vm != null) {
                        // read vm.isDisLike
                        vmIsDisLike = vm.isDisLike();
                    }
                    updateRegistration(3, vmIsDisLike);


                    if (vmIsDisLike != null) {
                        // read vm.isDisLike.get()
                        vmIsDisLikeGet = vmIsDisLike.get();
                    }
                if((dirtyFlags & 0x308L) != 0) {
                    if(vmIsDisLikeGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read vm.isDisLike.get() ? @android:drawable/ic_like_icon : @android:drawable/ic_thumbs_down
                    vmIsDisLikeIvFavDetailsDislikeAndroidDrawableIcLikeIconIvFavDetailsDislikeAndroidDrawableIcThumbsDown = ((vmIsDisLikeGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivFavDetailsDislike.getContext(), R.drawable.ic_like_icon)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivFavDetailsDislike.getContext(), R.drawable.ic_thumbs_down)));
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (vm != null) {
                        // read vm.tvFavDetailsAddress
                        vmTvFavDetailsAddress = vm.getTvFavDetailsAddress();
                    }
                    updateRegistration(4, vmTvFavDetailsAddress);


                    if (vmTvFavDetailsAddress != null) {
                        // read vm.tvFavDetailsAddress.get()
                        vmTvFavDetailsAddressGet = vmTvFavDetailsAddress.get();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (vm != null) {
                        // read vm.fav_title
                        vmFavTitle = vm.getFav_title();
                    }
                    updateRegistration(5, vmFavTitle);


                    if (vmFavTitle != null) {
                        // read vm.fav_title.get()
                        vmFavTitleGet = vmFavTitle.get();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (vm != null) {
                        // read vm.LikesCount
                        vmLikesCount = vm.getLikesCount();
                    }
                    updateRegistration(6, vmLikesCount);


                    if (vmLikesCount != null) {
                        // read vm.LikesCount.get()
                        vmLikesCountGet = vmLikesCount.get();
                    }
            }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (vm != null) {
                        // read vm.DisLikesCount
                        vmDisLikesCount = vm.getDisLikesCount();
                    }
                    updateRegistration(7, vmDisLikesCount);


                    if (vmDisLikesCount != null) {
                        // read vm.DisLikesCount.get()
                        vmDisLikesCountGet = vmDisLikesCount.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.btnBookingProfile.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsChats.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsDislike.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsEmptyHeart.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsFilledHeart.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsLike.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsOptions.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            com.example.plazapalm.utils.BindingAdapters.setRecyclerAdapter(this.rvVideos, vmVideosAdapter);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivFavDetailsDislike, vmIsDisLikeIvFavDetailsDislikeAndroidDrawableIcLikeIconIvFavDetailsDislikeAndroidDrawableIcThumbsDown);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivFavDetailsLike, vmIsLikeIvFavDetailsLikeAndroidDrawableIcLikeIconIvFavDetailsLikeAndroidDrawableLikeUnfilledImage);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavCityAddress, vmTvFavCityAddressGet);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetails, vmFavTitleGet);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetails, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsDisLikeCount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsDisLikeCountandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsLikeCounts, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsLikeCountsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetailsName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetailsAddress, vmTvFavDetailsAddressGet);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetailsDisLikeCount, vmDisLikesCountGet);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetailsLikeCounts, vmLikesCountGet);
        }
        if ((dirtyFlags & 0x304L) != 0) {
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
        flag 0 (0x1L): vm.tvFavCityAddress
        flag 1 (0x2L): vm.isLike
        flag 2 (0x3L): vm.username
        flag 3 (0x4L): vm.isDisLike
        flag 4 (0x5L): vm.tvFavDetailsAddress
        flag 5 (0x6L): vm.fav_title
        flag 6 (0x7L): vm.LikesCount
        flag 7 (0x8L): vm.DisLikesCount
        flag 8 (0x9L): vm
        flag 9 (0xaL): null
        flag 10 (0xbL): vm.isDisLike.get() ? @android:drawable/ic_like_icon : @android:drawable/ic_thumbs_down
        flag 11 (0xcL): vm.isDisLike.get() ? @android:drawable/ic_like_icon : @android:drawable/ic_thumbs_down
        flag 12 (0xdL): vm.isLike.get() ? @android:drawable/ic_like_icon : @android:drawable/like_unfilled_image
        flag 13 (0xeL): vm.isLike.get() ? @android:drawable/ic_like_icon : @android:drawable/like_unfilled_image
    flag mapping end*/
    //end
}