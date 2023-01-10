package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddQuestionItemsBindingImpl extends AddQuestionItemsBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.vAddQuestion, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddQuestionItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private AddQuestionItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (com.apachat.swipereveallayout.core.SwipeLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.view.View) bindings[4]
            );
        this.deletereturn.setTag(null);
        this.slDeleteQuestions.setTag(null);
        this.tvQuestionCounts.setTag(null);
        this.tvQuestionValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
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
            setModel((com.example.plazapalm.models.QueData) variable);
        }
        else if (BR.getmodel == variableId) {
            setGetmodel((com.example.plazapalm.models.GetQueData) variable);
        }
        else if (BR.vmi == variableId) {
            setVmi((com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.QueData Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setGetmodel(@Nullable com.example.plazapalm.models.GetQueData Getmodel) {
        this.mGetmodel = Getmodel;
    }
    public void setVmi(@Nullable com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM Vmi) {
        this.mVmi = Vmi;
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
        com.example.plazapalm.models.QueData model = mModel;
        java.lang.String modelQuestionText = null;
        java.lang.String modelQuestionNo = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.question_text
                    modelQuestionText = model.getQuestion_text();
                    // read model.question_no
                    modelQuestionNo = model.getQuestion_no();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.deletereturn.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuestionCounts, modelQuestionNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuestionValue, modelQuestionText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.example.plazapalm.models.QueData model = mModel;
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


                modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "onSwipeItemClick");
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): getmodel
        flag 2 (0x3L): vmi
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}