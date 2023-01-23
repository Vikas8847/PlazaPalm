package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QuestionariesFragmentBindingImpl extends QuestionariesFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvQuestionary, 4);
        sViewsWithIds.put(R.id.clQuestionaryMain, 5);
        sViewsWithIds.put(R.id.new_question, 6);
        sViewsWithIds.put(R.id.rvQuestionary, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClicksAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public QuestionariesFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private QuestionariesFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.btnAddNewQuestions.setTag(null);
        this.ivQuestionaryBack.setTag(null);
        this.listemptyId.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setVm((com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmNoData((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmNoData(androidx.databinding.ObservableBoolean VmNoData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        android.view.View.OnClickListener vmOnClicksAndroidViewViewOnClickListener = null;
        com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM vm = mVm;
        java.lang.String vmNoDataListemptyIdAndroidStringNoQuestionsAddedYetListemptyIdAndroidStringSpace = null;
        androidx.databinding.ObservableBoolean vmNoData = null;
        boolean vmNoDataGet = false;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm::onClicks
                        vmOnClicksAndroidViewViewOnClickListener = (((mVmOnClicksAndroidViewViewOnClickListener == null) ? (mVmOnClicksAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClicksAndroidViewViewOnClickListener).setValue(vm));
                    }
            }

                if (vm != null) {
                    // read vm.noData
                    vmNoData = vm.getNoData();
                }
                updateRegistration(0, vmNoData);


                if (vmNoData != null) {
                    // read vm.noData.get()
                    vmNoDataGet = vmNoData.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(vmNoDataGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read vm.noData.get() ? @android:string/no_questions_added_yet : @android:string/space
                vmNoDataListemptyIdAndroidStringNoQuestionsAddedYetListemptyIdAndroidStringSpace = ((vmNoDataGet) ? (listemptyId.getResources().getString(R.string.no_questions_added_yet)) : (listemptyId.getResources().getString(R.string.space)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.btnAddNewQuestions.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
            this.ivQuestionaryBack.setOnClickListener(vmOnClicksAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.listemptyId, vmNoDataListemptyIdAndroidStringNoQuestionsAddedYetListemptyIdAndroidStringSpace);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM value;
        public OnClickListenerImpl setValue(com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM value) {
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
        flag 0 (0x1L): vm.noData
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
        flag 3 (0x4L): vm.noData.get() ? @android:string/no_questions_added_yet : @android:string/space
        flag 4 (0x5L): vm.noData.get() ? @android:string/no_questions_added_yet : @android:string/space
    flag mapping end*/
    //end
}