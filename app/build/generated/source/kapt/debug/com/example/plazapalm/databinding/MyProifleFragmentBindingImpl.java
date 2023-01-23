package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MyProifleFragmentBindingImpl extends MyProifleFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gLineMyProfile, 10);
        sViewsWithIds.put(R.id.tvMyProfile, 11);
        sViewsWithIds.put(R.id.ivMyProfileScanner, 12);
        sViewsWithIds.put(R.id.guidelineMyProfileViews, 13);
        sViewsWithIds.put(R.id.viewFavourite, 14);
        sViewsWithIds.put(R.id.viewCalendar, 15);
        sViewsWithIds.put(R.id.viewAccount, 16);
        sViewsWithIds.put(R.id.viewProfile, 17);
        sViewsWithIds.put(R.id.viewAdvanceSettings, 18);
        sViewsWithIds.put(R.id.viewQRCode, 19);
        sViewsWithIds.put(R.id.viewUpgrade, 20);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvMyProfileNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.firstName.get()
            //         is vm.firstName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvMyProfileName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.MyProfileVM vm = mVm;
            // vm.firstName != null
            boolean vmFirstNameJavaLangObjectNull = false;
            // vm.firstName
            androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;
            // vm.firstName.get()
            java.lang.String vmFirstNameGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmFirstName = vm.getFirstName();

                vmFirstNameJavaLangObjectNull = (vmFirstName) != (null);
                if (vmFirstNameJavaLangObjectNull) {




                    vmFirstName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvViewMyProfileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.status.get()
            //         is vm.status.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvViewMyProfile);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.myprofile.MyProfileVM vm = mVm;
            // vm.status
            androidx.databinding.ObservableField<java.lang.String> vmStatus = null;
            // vm.status != null
            boolean vmStatusJavaLangObjectNull = false;
            // vm.status.get()
            java.lang.String vmStatusGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmStatus = vm.getStatus();

                vmStatusJavaLangObjectNull = (vmStatus) != (null);
                if (vmStatusJavaLangObjectNull) {




                    vmStatus.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public MyProifleFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private MyProifleFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[20]
            );
        this.clMain.setTag(null);
        this.ivMyProfile.setTag(null);
        this.tvAccount.setTag(null);
        this.tvAdvanceSetting.setTag(null);
        this.tvCalendar.setTag(null);
        this.tvFavourite.setTag(null);
        this.tvMyProfileName.setTag(null);
        this.tvQRCode.setTag(null);
        this.tvUpgrade.setTag(null);
        this.tvViewMyProfile.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setVm((com.example.plazapalm.views.myprofile.MyProfileVM) variable);
        }
        else if (BR.ImageURL == variableId) {
            setImageURL((com.example.plazapalm.views.myprofile.MyProfileVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.myprofile.MyProfileVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setImageURL(@Nullable com.example.plazapalm.views.myprofile.MyProfileVM ImageURL) {
        this.mImageURL = ImageURL;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmStatus((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmFirstName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmStoredImageUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmStatus(androidx.databinding.ObservableField<java.lang.String> VmStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFirstName(androidx.databinding.ObservableField<java.lang.String> VmFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmStoredImageUrl(androidx.databinding.ObservableField<java.lang.String> VmStoredImageUrl, int fieldId) {
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
        java.lang.String vmFirstNameGet = null;
        java.lang.String vmStatusGet = null;
        com.example.plazapalm.views.myprofile.MyProfileVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmStatus = null;
        android.view.View.OnClickListener vmOnClickAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;
        java.lang.String vmStoredImageUrlGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmStoredImageUrl = null;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (vm != null) {
                        // read vm.status
                        vmStatus = vm.getStatus();
                    }
                    updateRegistration(0, vmStatus);


                    if (vmStatus != null) {
                        // read vm.status.get()
                        vmStatusGet = vmStatus.get();
                    }
            }
            if ((dirtyFlags & 0x28L) != 0) {

                    if (vm != null) {
                        // read vm::onClick
                        vmOnClickAndroidViewViewOnClickListener = (((mVmOnClickAndroidViewViewOnClickListener == null) ? (mVmOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClickAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.firstName
                        vmFirstName = vm.getFirstName();
                    }
                    updateRegistration(1, vmFirstName);


                    if (vmFirstName != null) {
                        // read vm.firstName.get()
                        vmFirstNameGet = vmFirstName.get();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (vm != null) {
                        // read vm.storedImageUrl
                        vmStoredImageUrl = vm.getStoredImageUrl();
                    }
                    updateRegistration(2, vmStoredImageUrl);


                    if (vmStoredImageUrl != null) {
                        // read vm.storedImageUrl.get()
                        vmStoredImageUrlGet = vmStoredImageUrl.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setCircleImage(this.ivMyProfile, vmStoredImageUrlGet);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.tvAccount.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
            this.tvAdvanceSetting.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
            this.tvCalendar.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
            this.tvFavourite.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
            this.tvQRCode.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
            this.tvUpgrade.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
            this.tvViewMyProfile.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMyProfileName, vmFirstNameGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvMyProfileName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvMyProfileNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvViewMyProfile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvViewMyProfileandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvViewMyProfile, vmStatusGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.myprofile.MyProfileVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.myprofile.MyProfileVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.status
        flag 1 (0x2L): vm.firstName
        flag 2 (0x3L): vm.storedImageUrl
        flag 3 (0x4L): vm
        flag 4 (0x5L): ImageURL
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}