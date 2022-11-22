package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ReportFragmentBindingImpl extends ReportFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvReport, 5);
        sViewsWithIds.put(R.id.ivReportBackButton, 6);
        sViewsWithIds.put(R.id.clReportSecond, 7);
        sViewsWithIds.put(R.id.scrollEditViewProfile, 8);
        sViewsWithIds.put(R.id.clEditProAllViewsHolder, 9);
        sViewsWithIds.put(R.id.tvReportSelected, 10);
        sViewsWithIds.put(R.id.tvReportAddNote, 11);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etReportAddNoteandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.reportNote.get()
            //         is vm.reportNote.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etReportAddNote);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.report.ReportVM vm = mVm;
            // vm.reportNote.get()
            java.lang.String vmReportNoteGet = null;
            // vm.reportNote != null
            boolean vmReportNoteJavaLangObjectNull = false;
            // vm.reportNote
            androidx.databinding.ObservableField<java.lang.String> vmReportNote = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmReportNote = vm.getReportNote();

                vmReportNoteJavaLangObjectNull = (vmReportNote) != (null);
                if (vmReportNoteJavaLangObjectNull) {




                    vmReportNote.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etReportSelectedandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.firstName.get()
            //         is vm.firstName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etReportSelected);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.example.plazapalm.views.report.ReportVM vm = mVm;
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

    public ReportFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ReportFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            );
        this.btnReportSubmit.setTag(null);
        this.clReportMain.setTag(null);
        this.etReportAddNote.setTag(null);
        this.etReportSelected.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setVm((com.example.plazapalm.views.report.ReportVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.report.ReportVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmFirstName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmReportNote((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmFirstName(androidx.databinding.ObservableField<java.lang.String> VmFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmReportNote(androidx.databinding.ObservableField<java.lang.String> VmReportNote, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String vmReportNoteGet = null;
        java.lang.String vmFirstNameGet = null;
        com.example.plazapalm.views.report.ReportVM vm = mVm;
        android.view.View.OnClickListener vmClicksAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> vmFirstName = null;
        androidx.databinding.ObservableField<java.lang.String> vmReportNote = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm::clicks
                        vmClicksAndroidViewViewOnClickListener = (((mVmClicksAndroidViewViewOnClickListener == null) ? (mVmClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.firstName
                        vmFirstName = vm.getFirstName();
                    }
                    updateRegistration(0, vmFirstName);


                    if (vmFirstName != null) {
                        // read vm.firstName.get()
                        vmFirstNameGet = vmFirstName.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.reportNote
                        vmReportNote = vm.getReportNote();
                    }
                    updateRegistration(1, vmReportNote);


                    if (vmReportNote != null) {
                        // read vm.reportNote.get()
                        vmReportNoteGet = vmReportNote.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnReportSubmit.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
            this.clReportMain.setOnClickListener(vmClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etReportAddNote, vmReportNoteGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etReportAddNote, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etReportAddNoteandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etReportSelected, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etReportSelectedandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etReportSelected, vmFirstNameGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.report.ReportVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.report.ReportVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clicks(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.firstName
        flag 1 (0x2L): vm.reportNote
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}