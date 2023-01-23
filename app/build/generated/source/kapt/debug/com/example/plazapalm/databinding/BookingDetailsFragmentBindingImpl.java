package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BookingDetailsFragmentBindingImpl extends BookingDetailsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvFavDetails, 11);
        sViewsWithIds.put(R.id.clBookingDetailsCircular, 12);
        sViewsWithIds.put(R.id.ivEditBookingDetailsProfile, 13);
        sViewsWithIds.put(R.id.tvBookingDetailsName, 14);
        sViewsWithIds.put(R.id.vBookingDetails, 15);
        sViewsWithIds.put(R.id.tvBookingDetailsLocation, 16);
        sViewsWithIds.put(R.id.tvBookingDetailsDescription, 17);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public BookingDetailsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private BookingDetailsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (android.view.View) bindings[15]
            );
        this.btnBookingDetailsCancel.setTag(null);
        this.ivBookingDetailsBack.setTag(null);
        this.ivFavDetailsOptions.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvBookDetailsDescriptionValue.setTag(null);
        this.tvBookingDetailDate.setTag(null);
        this.tvBookingDetailTime.setTag(null);
        this.tvBookingDetailViewProfile.setTag(null);
        this.tvBookingDetailsLocationCity.setTag(null);
        this.tvBookingDetailsProfession.setTag(null);
        this.tvBookingStatus.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setVm((com.example.plazapalm.views.bookingdetails.BookingDetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.bookingdetails.BookingDetailsVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCategaryName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmBookingStatus((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmLocation((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCategaryName(androidx.databinding.ObservableField<java.lang.String> VmCategaryName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription(androidx.databinding.ObservableField<java.lang.String> VmDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDate(androidx.databinding.ObservableField<java.lang.String> VmDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBookingStatus(androidx.databinding.ObservableField<java.lang.String> VmBookingStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLocation(androidx.databinding.ObservableField<java.lang.String> VmLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTime(androidx.databinding.ObservableField<java.lang.String> VmTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.databinding.ObservableField<java.lang.String> vmCategaryName = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
        java.lang.String vmDescriptionGet = null;
        com.example.plazapalm.views.bookingdetails.BookingDetailsVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmDate = null;
        androidx.databinding.ObservableField<java.lang.String> vmBookingStatus = null;
        androidx.databinding.ObservableField<java.lang.String> vmLocation = null;
        java.lang.String vmTimeGet = null;
        java.lang.String vmCategaryNameGet = null;
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmTime = null;
        java.lang.String vmDateGet = null;
        java.lang.String vmBookingStatusGet = null;
        java.lang.String vmLocationGet = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (vm != null) {
                        // read vm.categaryName
                        vmCategaryName = vm.getCategaryName();
                    }
                    updateRegistration(0, vmCategaryName);


                    if (vmCategaryName != null) {
                        // read vm.categaryName.get()
                        vmCategaryNameGet = vmCategaryName.get();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (vm != null) {
                        // read vm.description
                        vmDescription = vm.getDescription();
                    }
                    updateRegistration(1, vmDescription);


                    if (vmDescription != null) {
                        // read vm.description.get()
                        vmDescriptionGet = vmDescription.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (vm != null) {
                        // read vm.date
                        vmDate = vm.getDate();
                    }
                    updateRegistration(2, vmDate);


                    if (vmDate != null) {
                        // read vm.date.get()
                        vmDateGet = vmDate.get();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (vm != null) {
                        // read vm.bookingStatus
                        vmBookingStatus = vm.getBookingStatus();
                    }
                    updateRegistration(3, vmBookingStatus);


                    if (vmBookingStatus != null) {
                        // read vm.bookingStatus.get()
                        vmBookingStatusGet = vmBookingStatus.get();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (vm != null) {
                        // read vm.location
                        vmLocation = vm.getLocation();
                    }
                    updateRegistration(4, vmLocation);


                    if (vmLocation != null) {
                        // read vm.location.get()
                        vmLocationGet = vmLocation.get();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (vm != null) {
                        // read vm.time
                        vmTime = vm.getTime();
                    }
                    updateRegistration(5, vmTime);


                    if (vmTime != null) {
                        // read vm.time.get()
                        vmTimeGet = vmTime.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.btnBookingDetailsCancel.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivBookingDetailsBack.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivFavDetailsOptions.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvBookingDetailViewProfile.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookDetailsDescriptionValue, vmDescriptionGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookingDetailDate, vmDateGet);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookingDetailTime, vmTimeGet);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookingDetailsLocationCity, vmLocationGet);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookingDetailsProfession, vmCategaryNameGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookingStatus, vmBookingStatusGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.bookingdetails.BookingDetailsVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.bookingdetails.BookingDetailsVM value) {
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
        flag 0 (0x1L): vm.categaryName
        flag 1 (0x2L): vm.description
        flag 2 (0x3L): vm.date
        flag 3 (0x4L): vm.bookingStatus
        flag 4 (0x5L): vm.location
        flag 5 (0x6L): vm.time
        flag 6 (0x7L): vm
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}