package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReportChooseOptionItemsBindingImpl extends FragmentReportChooseOptionItemsBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rgFirst, 3);
        sViewsWithIds.put(R.id.viewFavourite, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener checkBoxandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.text
            //         is model.setText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(checkBox);
            // localize variables for thread safety
            // model
            com.example.plazapalm.models.ReportDataModal model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.text
            java.lang.String modelText = null;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {




                model.setText(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentReportChooseOptionItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentReportChooseOptionItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RadioGroup) bindings[3]
            , (android.view.View) bindings[4]
            );
        this.checkBox.setTag(null);
        this.constraintsClick.setTag(null);
        this.layoutCons.setTag(null);
        setRootTag(root);
        // listeners
        mCallback24 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
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
        if (BR.model == variableId) {
            setModel((com.example.plazapalm.models.ReportDataModal) variable);
        }
        else if (BR.isCheckedStatus == variableId) {
            setIsCheckedStatus((com.example.plazapalm.views.reportselection.ReportChooseVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.ReportDataModal Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setIsCheckedStatus(@Nullable com.example.plazapalm.views.reportselection.ReportChooseVM IsCheckedStatus) {
        this.mIsCheckedStatus = IsCheckedStatus;
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
        com.example.plazapalm.models.ReportDataModal model = mModel;
        boolean modelChecked = false;
        java.lang.String modelText = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.checked
                    modelChecked = model.isChecked();
                    // read model.text
                    modelText = model.getText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkBox, modelChecked);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkBox, modelText);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.checkBox, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, checkBoxandroidTextAttrChanged);
            this.constraintsClick.setOnClickListener(mCallback24);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.example.plazapalm.models.ReportDataModal model = mModel;
        // model.adapterPosition
        int modelAdapterPosition = 0;
        // model.onItemClick
        com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick modelOnItemClick = null;
        // model != null
        boolean modelJavaLangObjectNull = false;
        // model.onItemClick != null
        boolean modelOnItemClickJavaLangObjectNull = false;



        modelJavaLangObjectNull = (model) != (null);
        if (modelJavaLangObjectNull) {


            modelOnItemClick = model.getOnItemClick();

            modelOnItemClickJavaLangObjectNull = (modelOnItemClick) != (null);
            if (modelOnItemClickJavaLangObjectNull) {





                modelAdapterPosition = model.getAdapterPosition();


                modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "onReportChooseItemClick");
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): isCheckedStatus
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}