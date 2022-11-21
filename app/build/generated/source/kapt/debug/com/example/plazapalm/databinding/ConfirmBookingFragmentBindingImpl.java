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
        sViewsWithIds.put(R.id.tvFavDetails, 8);
        sViewsWithIds.put(R.id.ivConfirmBook, 9);
        sViewsWithIds.put(R.id.tvConfirmBookName, 10);
        sViewsWithIds.put(R.id.tvConfirmBookLocation, 11);
        sViewsWithIds.put(R.id.tvConfirmBookMiles, 12);
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

    public ConfirmBookingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ConfirmBookingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[19]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmChooseTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmChooseDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmDescription(androidx.databinding.ObservableField<java.lang.String> VmDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChooseTime(androidx.databinding.ObservableField<java.lang.String> VmChooseTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChooseDate(androidx.databinding.ObservableField<java.lang.String> VmChooseDate, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
        java.lang.String vmDescriptionGet = null;
        com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;
        java.lang.String vmChooseDateGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmChooseTime = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmChooseDate = null;
        java.lang.String vmChooseTimeGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.description
                        vmDescription = vm.getDescription();
                    }
                    updateRegistration(0, vmDescription);


                    if (vmDescription != null) {
                        // read vm.description.get()
                        vmDescriptionGet = vmDescription.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (vm != null) {
                        // read vm.chooseTime
                        vmChooseTime = vm.getChooseTime();
                    }
                    updateRegistration(1, vmChooseTime);


                    if (vmChooseTime != null) {
                        // read vm.chooseTime.get()
                        vmChooseTimeGet = vmChooseTime.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (vm != null) {
                        // read vm.chooseDate
                        vmChooseDate = vm.getChooseDate();
                    }
                    updateRegistration(2, vmChooseDate);


                    if (vmChooseDate != null) {
                        // read vm.chooseDate.get()
                        vmChooseDateGet = vmChooseDate.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.btnConfirmBook.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clMainConfirmBooking.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etConfirmBookDate.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.etConfirmBookTime.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivBookingDetailsChat.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivConfirmDetailsBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmBookDate, vmChooseDateGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmBookDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmBookDateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmBookDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmBookDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmBookTime, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmBookTimeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmBookDescription, vmDescriptionGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmBookTime, vmChooseTimeGet);
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
        flag 0 (0x1L): vm.description
        flag 1 (0x2L): vm.chooseTime
        flag 2 (0x3L): vm.chooseDate
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}