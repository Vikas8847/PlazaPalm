package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsFragmentBindingImpl extends SettingsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvSetting, 9);
        sViewsWithIds.put(R.id.guideline, 10);
        sViewsWithIds.put(R.id.clSettingsNotification, 11);
        sViewsWithIds.put(R.id.tvPushNotification, 12);
        sViewsWithIds.put(R.id.swOnOff, 13);
        sViewsWithIds.put(R.id.viewSettingPushNotification, 14);
        sViewsWithIds.put(R.id.viewChangePassword, 15);
        sViewsWithIds.put(R.id.viewUpdateEmail, 16);
        sViewsWithIds.put(R.id.viewSettingsPrivacy, 17);
        sViewsWithIds.put(R.id.viewSettingsTermsUse, 18);
        sViewsWithIds.put(R.id.viewSettingsContactUs, 19);
        sViewsWithIds.put(R.id.viewSettingsDeleteAccount, 20);
        sViewsWithIds.put(R.id.guideLineContactus, 21);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public SettingsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private SettingsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.SwitchCompat) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[16]
            );
        this.ivSettingBackBtn.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvSettingsChangePassword.setTag(null);
        this.tvSettingsContactUs.setTag(null);
        this.tvSettingsDeleteAccount.setTag(null);
        this.tvSettingsLogOut.setTag(null);
        this.tvSettingsPrivacyPolicy.setTag(null);
        this.tvSettingsTermsUse.setTag(null);
        this.tvSettingsUpdateEmail.setTag(null);
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
            setVm((com.example.plazapalm.views.settings.SettingsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.settings.SettingsVM Vm) {
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
        com.example.plazapalm.views.settings.SettingsVM vm = mVm;
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

            this.ivSettingBackBtn.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsChangePassword.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsContactUs.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsDeleteAccount.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsLogOut.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsPrivacyPolicy.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsTermsUse.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.tvSettingsUpdateEmail.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.settings.SettingsVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.settings.SettingsVM value) {
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