package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CategoriesListItemsBindingImpl extends CategoriesListItemsBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewFavourite, 2);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CategoriesListItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private CategoriesListItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (android.view.View) bindings[2]
            );
        this.clCategoriesList.setTag(null);
        this.tvSelectCategory.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
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
        if (BR.model == variableId) {
            setModel((com.example.plazapalm.models.CategoriesData) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.example.plazapalm.views.catergorylist.CategoriesListVM) variable);
        }
        else if (BR.categoryName == variableId) {
            setCategoryName((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.CategoriesData Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setVm(@Nullable com.example.plazapalm.views.catergorylist.CategoriesListVM Vm) {
        this.mVm = Vm;
    }
    public void setCategoryName(@Nullable java.lang.String CategoryName) {
        this.mCategoryName = CategoryName;
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
        com.example.plazapalm.models.CategoriesData model = mModel;
        boolean modelIsCheckBooleanTrue = false;
        java.lang.String modelCount = null;
        android.graphics.drawable.Drawable modelIsCheckBooleanTrueTvSelectCategoryAndroidDrawableIcCheckboxTickIconTvSelectCategoryAndroidDrawableIcCheckboxUnselectTickIcon = null;
        boolean modelCategoryNameJavaLangObjectNull = false;
        java.lang.String modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangString = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelIsCheck = false;
        boolean modelCountJavaLangObjectNull = false;
        java.lang.Boolean modelIsCheck = null;
        java.lang.String modelCountJavaLangObjectNullJavaLangStringModelCount = null;
        java.lang.String modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryName = null;
        java.lang.String modelCategoryName = null;
        java.lang.String modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangStringModelCountJavaLangObjectNullJavaLangStringModelCountJavaLangString = null;
        java.lang.String modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangStringModelCountJavaLangObjectNullJavaLangStringModelCount = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.count
                    modelCount = model.getCount();
                    // read model.isCheck()
                    modelIsCheck = model.isCheck();
                    // read model.category_name
                    modelCategoryName = model.getCategory_name();
                }


                // read model.count == null
                modelCountJavaLangObjectNull = (modelCount) == (null);
                // read androidx.databinding.ViewDataBinding.safeUnbox(model.isCheck())
                androidxDatabindingViewDataBindingSafeUnboxModelIsCheck = androidx.databinding.ViewDataBinding.safeUnbox(modelIsCheck);
                // read model.category_name == null
                modelCategoryNameJavaLangObjectNull = (modelCategoryName) == (null);
            if((dirtyFlags & 0x9L) != 0) {
                if(modelCountJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x9L) != 0) {
                if(modelCategoryNameJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(model.isCheck()) == true
                modelIsCheckBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxModelIsCheck) == (true);
            if((dirtyFlags & 0x9L) != 0) {
                if(modelIsCheckBooleanTrue) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(model.isCheck()) == true ? @android:drawable/ic_checkbox_tick_icon : @android:drawable/ic_checkbox_unselect_tick_icon
                modelIsCheckBooleanTrueTvSelectCategoryAndroidDrawableIcCheckboxTickIconTvSelectCategoryAndroidDrawableIcCheckboxUnselectTickIcon = ((modelIsCheckBooleanTrue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvSelectCategory.getContext(), R.drawable.ic_checkbox_tick_icon)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvSelectCategory.getContext(), R.drawable.ic_checkbox_unselect_tick_icon)));
        }
        // batch finished

        if ((dirtyFlags & 0x9L) != 0) {

                // read model.count == null ? "" : model.count
                modelCountJavaLangObjectNullJavaLangStringModelCount = ((modelCountJavaLangObjectNull) ? ("") : (modelCount));
                // read model.category_name == null ? "" : model.category_name
                modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryName = ((modelCategoryNameJavaLangObjectNull) ? ("") : (modelCategoryName));


                // read (model.category_name == null ? "" : model.category_name) + (" (")
                modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangString = (modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryName) + (" (");


                // read ((model.category_name == null ? "" : model.category_name) + (" (")) + (model.count == null ? "" : model.count)
                modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangStringModelCountJavaLangObjectNullJavaLangStringModelCount = (modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangString) + (modelCountJavaLangObjectNullJavaLangStringModelCount);


                // read (((model.category_name == null ? "" : model.category_name) + (" (")) + (model.count == null ? "" : model.count)) + (")")
                modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangStringModelCountJavaLangObjectNullJavaLangStringModelCountJavaLangString = (modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangStringModelCountJavaLangObjectNullJavaLangStringModelCount) + (")");
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.clCategoriesList.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.tvSelectCategory, modelIsCheckBooleanTrueTvSelectCategoryAndroidDrawableIcCheckboxTickIconTvSelectCategoryAndroidDrawableIcCheckboxUnselectTickIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSelectCategory, modelCategoryNameJavaLangObjectNullJavaLangStringModelCategoryNameJavaLangStringModelCountJavaLangObjectNullJavaLangStringModelCountJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.example.plazapalm.models.CategoriesData model = mModel;
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


                modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "PostProfile");
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): vm
        flag 2 (0x3L): categoryName
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(model.isCheck()) == true ? @android:drawable/ic_checkbox_tick_icon : @android:drawable/ic_checkbox_unselect_tick_icon
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(model.isCheck()) == true ? @android:drawable/ic_checkbox_tick_icon : @android:drawable/ic_checkbox_unselect_tick_icon
        flag 6 (0x7L): model.count == null ? "" : model.count
        flag 7 (0x8L): model.count == null ? "" : model.count
        flag 8 (0x9L): model.category_name == null ? "" : model.category_name
        flag 9 (0xaL): model.category_name == null ? "" : model.category_name
    flag mapping end*/
    //end
}