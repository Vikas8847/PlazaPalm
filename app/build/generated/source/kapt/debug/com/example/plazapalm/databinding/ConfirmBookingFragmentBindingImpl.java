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
        sViewsWithIds.put(R.id.tvFavDetails, 5);
        sViewsWithIds.put(R.id.ivConfirmBook, 6);
        sViewsWithIds.put(R.id.tvConfirmBookName, 7);
        sViewsWithIds.put(R.id.tvConfirmBookLocation, 8);
        sViewsWithIds.put(R.id.tvConfirmBookMiles, 9);
        sViewsWithIds.put(R.id.gLineConfirmBook, 10);
        sViewsWithIds.put(R.id.tvConfirmBookChooseDate, 11);
        sViewsWithIds.put(R.id.etConfirmBookDate, 12);
        sViewsWithIds.put(R.id.tvConfirmBookChooseTime, 13);
        sViewsWithIds.put(R.id.etConfirmBookTime, 14);
        sViewsWithIds.put(R.id.tvConfirmBookDescription, 15);
        sViewsWithIds.put(R.id.etConfirmBookDescription, 16);
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

    public ConfirmBookingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ConfirmBookingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[16]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[19]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.btnConfirmBook.setTag(null);
        this.clMainConfirmBooking.setTag(null);
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
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        com.example.plazapalm.views.confirmbookthankyou.ConfirmBookingVM vm = mVm;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vm != null) {
                    // read vm::onClicks
                    vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btnConfirmBook.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.clMainConfirmBooking.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivBookingDetailsChat.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivConfirmDetailsBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
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
        flag 0 (0x1L): vm
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}