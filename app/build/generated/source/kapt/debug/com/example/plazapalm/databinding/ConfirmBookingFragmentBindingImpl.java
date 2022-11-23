package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConfirmBookingFragmentBindingImpl extends ConfirmBookingFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivConfirmBook, 12);
        sViewsWithIds.put(R.id.gLineConfirmBook, 13);
        sViewsWithIds.put(R.id.tvConfirmBookChooseDate, 14);
        sViewsWithIds.put(R.id.tvConfirmBookChooseTime, 15);
        sViewsWithIds.put(R.id.tvConfirmBookDescription, 16);
        sViewsWithIds.put(R.id.tvConfirmBookQuestionOne, 17);
        sViewsWithIds.put(R.id.tvConfirmBookQuestionHair, 18);
        sViewsWithIds.put(R.id.etConfirmBookQuestionAns, 19);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etConfirmBookDateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.chooseDate.get()
            //         is vm.chooseDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etConfirmBookDate);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.chooseDate
            androidx.databinding.ObservableField<java.lang.String> vmChooseDate = null;
            // vm.chooseDate.get()
            java.lang.String vmChooseDateGet = null;
            // vm.chooseDate != null
            boolean vmChooseDateJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmChooseDate = vm.getChooseDate();

                vmChooseDateJavaLangObjectNull = (vmChooseDate) != (null);
                if (vmChooseDateJavaLangObjectNull) {




                    vmChooseDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etConfirmBookDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description.get()
            //         is vm.description.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etConfirmBookDescription);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.description.get()
            java.lang.String vmDescriptionGet = null;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.description
            androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
            // vm.description != null
            boolean vmDescriptionJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDescription = vm.getDescription();

                vmDescriptionJavaLangObjectNull = (vmDescription) != (null);
                if (vmDescriptionJavaLangObjectNull) {




                    vmDescription.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etConfirmBookTimeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.chooseTime.get()
            //         is vm.chooseTime.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etConfirmBookTime);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.chooseTime.get()
            java.lang.String vmChooseTimeGet = null;
            // vm.chooseTime
            androidx.databinding.ObservableField<java.lang.String> vmChooseTime = null;
            // vm.chooseTime != null
            boolean vmChooseTimeJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmChooseTime = vm.getChooseTime();

                vmChooseTimeJavaLangObjectNull = (vmChooseTime) != (null);
                if (vmChooseTimeJavaLangObjectNull) {




                    vmChooseTime.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvConfirmBookLocationandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.user_location.get()
            //         is vm.user_location.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvConfirmBookLocation);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.user_location
            androidx.databinding.ObservableField<java.lang.String> vmUserLocation = null;
            // vm.user_location.get()
            java.lang.String vmUserLocationGet = null;
            // vm.user_location != null
            boolean vmUserLocationJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUserLocation = vm.getUser_location();

                vmUserLocationJavaLangObjectNull = (vmUserLocation) != (null);
                if (vmUserLocationJavaLangObjectNull) {




                    vmUserLocation.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvConfirmBookMilesandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.user_miles.get()
            //         is vm.user_miles.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvConfirmBookMiles);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.user_miles
            androidx.databinding.ObservableField<java.lang.String> vmUserMiles = null;
            // vm.user_miles != null
            boolean vmUserMilesJavaLangObjectNull = false;
            // vm.user_miles.get()
            java.lang.String vmUserMilesGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUserMiles = vm.getUser_miles();

                vmUserMilesJavaLangObjectNull = (vmUserMiles) != (null);
                if (vmUserMilesJavaLangObjectNull) {




                    vmUserMiles.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvConfirmBookNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.user_Name.get()
            //         is vm.user_Name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvConfirmBookName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.user_Name != null
            boolean vmUserNameJavaLangObjectNull = false;
            // vm.user_Name
            androidx.databinding.ObservableField<java.lang.String> vmUserName = null;
            // vm.user_Name.get()
            java.lang.String vmUserNameGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUserName = vm.getUser_Name();

                vmUserNameJavaLangObjectNull = (vmUserName) != (null);
                if (vmUserNameJavaLangObjectNull) {




                    vmUserName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvFavDetailsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.title.get()
            //         is vm.title.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvFavDetails);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.title
            androidx.databinding.ObservableField<java.lang.String> vmTitle = null;
            // vm.title.get()
            java.lang.String vmTitleGet = null;
            // vm
            com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
            // vm.title != null
            boolean vmTitleJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTitle = vm.getTitle();

                vmTitleJavaLangObjectNull = (vmTitle) != (null);
                if (vmTitleJavaLangObjectNull) {




                    vmTitle.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ConfirmBookingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ConfirmBookingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[10]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[19]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.btnConfirmBook.setTag(null);
        this.clMainConfirmBooking.setTag(null);
        this.etConfirmBookDate.setTag(null);
        this.etConfirmBookDescription.setTag(null);
        this.etConfirmBookTime.setTag(null);
        this.ivBookingDetailsChat.setTag(null);
        this.ivConfirmDetailsBackBtn.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvConfirmBookLocation.setTag(null);
        this.tvConfirmBookMiles.setTag(null);
        this.tvConfirmBookName.setTag(null);
        this.tvFavDetails.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setVm((com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUserMiles((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmUserLocation((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmChooseTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmUserName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmChooseDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUserMiles(androidx.databinding.ObservableField<java.lang.String> VmUserMiles, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTitle(androidx.databinding.ObservableField<java.lang.String> VmTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUserLocation(androidx.databinding.ObservableField<java.lang.String> VmUserLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription(androidx.databinding.ObservableField<java.lang.String> VmDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChooseTime(androidx.databinding.ObservableField<java.lang.String> VmChooseTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUserName(androidx.databinding.ObservableField<java.lang.String> VmUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChooseDate(androidx.databinding.ObservableField<java.lang.String> VmChooseDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.databinding.ObservableField<java.lang.String> vmUserMiles = null;
        java.lang.String vmDescriptionGet = null;
        com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
        java.lang.String vmChooseDateGet = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        java.lang.String vmTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmTitle = null;
        androidx.databinding.ObservableField<java.lang.String> vmUserLocation = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
        androidx.databinding.ObservableField<java.lang.String> vmChooseTime = null;
        androidx.databinding.ObservableField<java.lang.String> vmUserName = null;
        java.lang.String vmUserNameGet = null;
        java.lang.String vmUserLocationGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmChooseDate = null;
        java.lang.String vmUserMilesGet = null;
        java.lang.String vmChooseTimeGet = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (vm != null) {
                        // read vm.user_miles
                        vmUserMiles = vm.getUser_miles();
                    }
                    updateRegistration(0, vmUserMiles);


                    if (vmUserMiles != null) {
                        // read vm.user_miles.get()
                        vmUserMilesGet = vmUserMiles.get();
                    }
            }
            if ((dirtyFlags & 0x180L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (vm != null) {
                        // read vm.title
                        vmTitle = vm.getTitle();
                    }
                    updateRegistration(1, vmTitle);


                    if (vmTitle != null) {
                        // read vm.title.get()
                        vmTitleGet = vmTitle.get();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (vm != null) {
                        // read vm.user_location
                        vmUserLocation = vm.getUser_location();
                    }
                    updateRegistration(2, vmUserLocation);


                    if (vmUserLocation != null) {
                        // read vm.user_location.get()
                        vmUserLocationGet = vmUserLocation.get();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (vm != null) {
                        // read vm.description
                        vmDescription = vm.getDescription();
                    }
                    updateRegistration(3, vmDescription);


                    if (vmDescription != null) {
                        // read vm.description.get()
                        vmDescriptionGet = vmDescription.get();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (vm != null) {
                        // read vm.chooseTime
                        vmChooseTime = vm.getChooseTime();
                    }
                    updateRegistration(4, vmChooseTime);


                    if (vmChooseTime != null) {
                        // read vm.chooseTime.get()
                        vmChooseTimeGet = vmChooseTime.get();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (vm != null) {
                        // read vm.user_Name
                        vmUserName = vm.getUser_Name();
                    }
                    updateRegistration(5, vmUserName);


                    if (vmUserName != null) {
                        // read vm.user_Name.get()
                        vmUserNameGet = vmUserName.get();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (vm != null) {
                        // read vm.chooseDate
                        vmChooseDate = vm.getChooseDate();
                    }
                    updateRegistration(6, vmChooseDate);


                    if (vmChooseDate != null) {
                        // read vm.chooseDate.get()
                        vmChooseDateGet = vmChooseDate.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.btnConfirmBook.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clMainConfirmBooking.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etConfirmBookDate.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etConfirmBookTime.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivBookingDetailsChat.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivConfirmDetailsBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmBookDate, vmChooseDateGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmBookDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmBookDateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmBookDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmBookDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmBookTime, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmBookTimeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvConfirmBookLocation, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvConfirmBookLocationandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvConfirmBookMiles, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvConfirmBookMilesandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvConfirmBookName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvConfirmBookNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvFavDetails, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvFavDetailsandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmBookDescription, vmDescriptionGet);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmBookTime, vmChooseTimeGet);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvConfirmBookLocation, vmUserLocationGet);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvConfirmBookMiles, vmUserMilesGet);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvConfirmBookName, vmUserNameGet);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavDetails, vmTitleGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM value) {
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
        flag 0 (0x1L): vm.user_miles
        flag 1 (0x2L): vm.title
        flag 2 (0x3L): vm.user_location
        flag 3 (0x4L): vm.description
        flag 4 (0x5L): vm.chooseTime
        flag 5 (0x6L): vm.user_Name
        flag 6 (0x7L): vm.chooseDate
        flag 7 (0x8L): vm
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}