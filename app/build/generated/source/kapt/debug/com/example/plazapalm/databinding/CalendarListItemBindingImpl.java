package com.example.plazapalm.databinding;
import com.example.plazapalm.R;
import com.example.plazapalm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CalendarListItemBindingImpl extends CalendarListItemBinding implements com.example.plazapalm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvClBookLocationName, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CalendarListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CalendarListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.ivCalendarDelete.setTag(null);
        this.ivCalenderChat.setTag(null);
        this.mailLayout.setTag(null);
        this.tvClBookingUserDate.setTag(null);
        this.tvClBookingUserName.setTag(null);
        this.tvClBookingUserTime.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.example.plazapalm.generated.callback.OnClickListener(this, 3);
        mCallback21 = new com.example.plazapalm.generated.callback.OnClickListener(this, 1);
        mCallback22 = new com.example.plazapalm.generated.callback.OnClickListener(this, 2);
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
            setModel((com.example.plazapalm.models.CalenderData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.plazapalm.models.CalenderData Model) {
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
        com.example.plazapalm.models.CalenderData model = mModel;
        java.lang.String modelPostProfileLastName = null;
        java.lang.String modelBookingStatus = null;
        java.lang.String modelChooseTime = null;
        java.lang.String modelChooseDate = null;
        java.lang.String modelPostProfileFirstName = null;
        java.lang.String modelPostProfileFirstNameCharModelPostProfileLastName = null;
        java.lang.String modelPostProfileFirstNameChar = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.postProfile_last_name
                    modelPostProfileLastName = model.getPostProfile_last_name();
                    // read model.booking_status
                    modelBookingStatus = model.getBooking_status();
                    // read model.choose_time
                    modelChooseTime = model.getChoose_time();
                    // read model.choose_date
                    modelChooseDate = model.getChoose_date();
                    // read model.postProfile_first_name
                    modelPostProfileFirstName = model.getPostProfile_first_name();
                }


                // read (model.postProfile_first_name) + (' ')
                modelPostProfileFirstNameChar = (modelPostProfileFirstName) + (' ');


                // read ((model.postProfile_first_name) + (' ')) + (model.postProfile_last_name)
                modelPostProfileFirstNameCharModelPostProfileLastName = (modelPostProfileFirstNameChar) + (modelPostProfileLastName);
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.ivCalendarDelete.setOnClickListener(mCallback22);
            this.ivCalenderChat.setOnClickListener(mCallback23);
            this.mailLayout.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.plazapalm.utils.BindingAdapters.setCalndarBackground(this.mailLayout, modelBookingStatus);
            com.example.plazapalm.utils.BindingAdapters.setText(this.tvClBookingUserDate, modelChooseDate);
            com.example.plazapalm.utils.BindingAdapters.setText(this.tvClBookingUserName, modelPostProfileFirstNameCharModelPostProfileLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvClBookingUserTime, modelChooseTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.CalenderData model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "calendarBookingToChat");
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.CalenderData model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "calendarBookingDetails");
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // model
                com.example.plazapalm.models.CalenderData model = mModel;
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


                        modelOnItemClick.onClick(callbackArg_0, modelAdapterPosition, "deleteConfirmBooking");
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}