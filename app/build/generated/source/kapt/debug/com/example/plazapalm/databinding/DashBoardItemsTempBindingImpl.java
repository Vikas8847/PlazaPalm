package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DashBoardItemsTempBindingImpl extends DashBoardItemsTempBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.imageview.ShapeableImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvDashBoardItemDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.description
            //         is model.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDashBoardItemDescription);
            // localize variables for thread safety
            // model
            com.example.plazapalm.models.DashBoardModel model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.description
            java.lang.String modelDescription = null;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {




                model.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDashBoardItemLocationandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.locationName
            //         is model.setLocationName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDashBoardItemLocation);
            // localize variables for thread safety
            // model
            com.example.plazapalm.models.DashBoardModel model = mModel;
            // model != null
            boolean modelJavaLangObjectNull = false;
            // model.locationName
            java.lang.String modelLocationName = null;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {




                model.setLocationName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDashBoardItemNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of model.name
            //         is model.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDashBoardItemName);
            // localize variables for thread safety
            // model
            com.example.plazapalm.models.DashBoardModel model = mModel;
            // model.name
            java.lang.String modelName = null;
            // model != null
            boolean modelJavaLangObjectNull = false;



            modelJavaLangObjectNull = (model) != (null);
            if (modelJavaLangObjectNull) {




                model.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public DashBoardItemsTempBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DashBoardItemsTempBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.imageview.ShapeableImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.tvDashBoardItemDescription.setTag(null);
        this.tvDashBoardItemDistance.setTag(null);
        this.tvDashBoardItemLocation.setTag(null);
        this.tvDashBoardItemName.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.example.plazapalm.models.DashBoardModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.DashBoardModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        com.example.plazapalm.models.DashBoardModel model = mModel;
        java.lang.String modelMilesJavaLangStringJavaLangStringMiles = null;
        int modelMiles = 0;
        int modelImage = 0;
        java.lang.String modelDescription = null;
        java.lang.String modelMilesJavaLangString = null;
        java.lang.String modelName = null;
        java.lang.String modelLocationName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.miles
                    modelMiles = model.getMiles();
                    // read model.image
                    modelImage = model.getImage();
                    // read model.description
                    modelDescription = model.getDescription();
                    // read model.name
                    modelName = model.getName();
                    // read model.locationName
                    modelLocationName = model.getLocationName();
                }


                // read (model.miles) + ("")
                modelMilesJavaLangString = (modelMiles) + ("");


                // read ((model.miles) + ("")) + ("miles")
                modelMilesJavaLangStringJavaLangStringMiles = (modelMilesJavaLangString) + ("miles");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setBackground(this.mboundView1, modelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemDescription, modelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemDistance, modelMilesJavaLangStringJavaLangStringMiles);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemLocation, modelLocationName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDashBoardItemName, modelName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDashBoardItemDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDashBoardItemDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDashBoardItemLocation, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDashBoardItemLocationandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDashBoardItemName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDashBoardItemNameandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}