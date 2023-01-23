package com.example.plazapalm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.databinding.ActivityMainBindingImpl;
import com.example.plazapalm.databinding.AddCitiesFragmentBindingImpl;
import com.example.plazapalm.databinding.AddImagesViewProfileBindingImpl;
import com.example.plazapalm.databinding.AddPhotosFragmentBindingImpl;
import com.example.plazapalm.databinding.AddPhotosItemListBindingImpl;
import com.example.plazapalm.databinding.AddQuestionItemsBindingImpl;
import com.example.plazapalm.databinding.AddQuestionsBindingImpl;
import com.example.plazapalm.databinding.AdvanceEditLookFragmentBindingImpl;
import com.example.plazapalm.databinding.AdvanceMapBottomSheetBindingImpl;
import com.example.plazapalm.databinding.AdvanceMapFragmentBindingImpl;
import com.example.plazapalm.databinding.AdvanceSettGalleryFramentFragmentBindingImpl;
import com.example.plazapalm.databinding.AdvanceSettingFragmentBindingImpl;
import com.example.plazapalm.databinding.AdvanceSettingMapFragmentBindingImpl;
import com.example.plazapalm.databinding.AdvanceShowViewProfileBindingImpl;
import com.example.plazapalm.databinding.AlertExitBindingImpl;
import com.example.plazapalm.databinding.BlockUserProfileBindingImpl;
import com.example.plazapalm.databinding.BookingDetailsFragmentBindingImpl;
import com.example.plazapalm.databinding.CalendarFragmentBindingImpl;
import com.example.plazapalm.databinding.CalendarListItemBindingImpl;
import com.example.plazapalm.databinding.CameraAndGalleryEditProfileBindingImpl;
import com.example.plazapalm.databinding.CategoriesListFragmentBindingImpl;
import com.example.plazapalm.databinding.CategoriesListItemsBindingImpl;
import com.example.plazapalm.databinding.CategoriesTempBindingImpl;
import com.example.plazapalm.databinding.ChangePasswordFragmentBindingImpl;
import com.example.plazapalm.databinding.ChatFragmentBindingImpl;
import com.example.plazapalm.databinding.ChatReceiverBindingImpl;
import com.example.plazapalm.databinding.ChatSenderBindingImpl;
import com.example.plazapalm.databinding.ChooseColorItemsBindingImpl;
import com.example.plazapalm.databinding.ChooseColorsBindingImpl;
import com.example.plazapalm.databinding.ChooseProfileOptionsBindingImpl;
import com.example.plazapalm.databinding.ConfirmBookingDatepickerBindingImpl;
import com.example.plazapalm.databinding.ConfirmBookingFragmentBindingImpl;
import com.example.plazapalm.databinding.ConfirmBookingTimepickerBindingImpl;
import com.example.plazapalm.databinding.ContactUsFragmentBindingImpl;
import com.example.plazapalm.databinding.DashBoardEventsItemsBindingImpl;
import com.example.plazapalm.databinding.DashBoardFragmentBindingImpl;
import com.example.plazapalm.databinding.DashBoardItemsBindingImpl;
import com.example.plazapalm.databinding.DashBoardItemsTempBindingImpl;
import com.example.plazapalm.databinding.DashSelectedEventsBindingImpl;
import com.example.plazapalm.databinding.DeleteAccountAlertBindingImpl;
import com.example.plazapalm.databinding.DeletePostprofileBindingImpl;
import com.example.plazapalm.databinding.DeleteSwipeAlertBindingImpl;
import com.example.plazapalm.databinding.EditFrontPageFragmentBindingImpl;
import com.example.plazapalm.databinding.EditOrDeleteProfileBindingImpl;
import com.example.plazapalm.databinding.EditProfileFragmentBindingImpl;
import com.example.plazapalm.databinding.EmailVerifyFragmentBindingImpl;
import com.example.plazapalm.databinding.FavDetailsChooseOptionsBindingImpl;
import com.example.plazapalm.databinding.FavDetailsFragmentBindingImpl;
import com.example.plazapalm.databinding.FavTempBindingImpl;
import com.example.plazapalm.databinding.FavouritesFragmentBindingImpl;
import com.example.plazapalm.databinding.FavouritesListItemsBindingImpl;
import com.example.plazapalm.databinding.FilterCatergoriesItemBindingImpl;
import com.example.plazapalm.databinding.FilterFragmentBindingImpl;
import com.example.plazapalm.databinding.FontsListFragmentBindingImpl;
import com.example.plazapalm.databinding.FontsListItemBindingImpl;
import com.example.plazapalm.databinding.ForgotPasswordFragmentBindingImpl;
import com.example.plazapalm.databinding.FragmentDetailsCategeroyBindingImpl;
import com.example.plazapalm.databinding.FragmentOpenCategeroyBindingImpl;
import com.example.plazapalm.databinding.FragmentReportChooseOptionBindingImpl;
import com.example.plazapalm.databinding.FragmentReportChooseOptionItemsBindingImpl;
import com.example.plazapalm.databinding.FragmentSelectCategoryBindingImpl;
import com.example.plazapalm.databinding.LoginFragmentBindingImpl;
import com.example.plazapalm.databinding.LogoutAlertBindingImpl;
import com.example.plazapalm.databinding.MessagesFragmentBindingImpl;
import com.example.plazapalm.databinding.MessagesUserListBindingImpl;
import com.example.plazapalm.databinding.MyProifleFragmentBindingImpl;
import com.example.plazapalm.databinding.OpenCameraAndGalleryBindingImpl;
import com.example.plazapalm.databinding.PicturesFragmentBindingImpl;
import com.example.plazapalm.databinding.PicturesItemListBindingImpl;
import com.example.plazapalm.databinding.PicturesItemUploadImageVideosBindingImpl;
import com.example.plazapalm.databinding.PostProfileFragmentBindingImpl;
import com.example.plazapalm.databinding.PremiumEditProfileFragmentBindingImpl;
import com.example.plazapalm.databinding.PrivacyPolicyFragmentBindingImpl;
import com.example.plazapalm.databinding.ProgressLayoutBindingImpl;
import com.example.plazapalm.databinding.QrCodeGenerateFragmentBindingImpl;
import com.example.plazapalm.databinding.QrCodeScannerFragmentBindingImpl;
import com.example.plazapalm.databinding.QuestionariesFragmentBindingImpl;
import com.example.plazapalm.databinding.ReportFragmentBindingImpl;
import com.example.plazapalm.databinding.RepositoryAlertBindingImpl;
import com.example.plazapalm.databinding.SelectedCateoriesItemsBindingImpl;
import com.example.plazapalm.databinding.SettingsFragmentBindingImpl;
import com.example.plazapalm.databinding.ShowPictureVideoFragmentBindingImpl;
import com.example.plazapalm.databinding.SignupFragmentBindingImpl;
import com.example.plazapalm.databinding.SlectCateItemsBindingImpl;
import com.example.plazapalm.databinding.SplashFragmentBindingImpl;
import com.example.plazapalm.databinding.TermsUseFragmentBindingImpl;
import com.example.plazapalm.databinding.ThankYouFragmentBindingImpl;
import com.example.plazapalm.databinding.UpdateEmailFragmentBindingImpl;
import com.example.plazapalm.databinding.UpgradeProFragmentBindingImpl;
import com.example.plazapalm.databinding.VerifyEmailFragmentBindingImpl;
import com.example.plazapalm.databinding.ViewProfileFragmentBindingImpl;
import com.example.plazapalm.databinding.ViewProfileImagesListBindingImpl;
import com.example.plazapalm.databinding.ViewprofileChooseoptionBindingImpl;
import com.example.plazapalm.databinding.WelcomeFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ADDCITIESFRAGMENT = 2;

  private static final int LAYOUT_ADDIMAGESVIEWPROFILE = 3;

  private static final int LAYOUT_ADDPHOTOSFRAGMENT = 4;

  private static final int LAYOUT_ADDPHOTOSITEMLIST = 5;

  private static final int LAYOUT_ADDQUESTIONITEMS = 6;

  private static final int LAYOUT_ADDQUESTIONS = 7;

  private static final int LAYOUT_ADVANCEEDITLOOKFRAGMENT = 8;

  private static final int LAYOUT_ADVANCEMAPBOTTOMSHEET = 9;

  private static final int LAYOUT_ADVANCEMAPFRAGMENT = 10;

  private static final int LAYOUT_ADVANCESETTGALLERYFRAMENTFRAGMENT = 11;

  private static final int LAYOUT_ADVANCESETTINGFRAGMENT = 12;

  private static final int LAYOUT_ADVANCESETTINGMAPFRAGMENT = 13;

  private static final int LAYOUT_ADVANCESHOWVIEWPROFILE = 14;

  private static final int LAYOUT_ALERTEXIT = 15;

  private static final int LAYOUT_BLOCKUSERPROFILE = 16;

  private static final int LAYOUT_BOOKINGDETAILSFRAGMENT = 17;

  private static final int LAYOUT_CALENDARFRAGMENT = 18;

  private static final int LAYOUT_CALENDARLISTITEM = 19;

  private static final int LAYOUT_CAMERAANDGALLERYEDITPROFILE = 20;

  private static final int LAYOUT_CATEGORIESLISTFRAGMENT = 21;

  private static final int LAYOUT_CATEGORIESLISTITEMS = 22;

  private static final int LAYOUT_CATEGORIESTEMP = 23;

  private static final int LAYOUT_CHANGEPASSWORDFRAGMENT = 24;

  private static final int LAYOUT_CHATFRAGMENT = 25;

  private static final int LAYOUT_CHATRECEIVER = 26;

  private static final int LAYOUT_CHATSENDER = 27;

  private static final int LAYOUT_CHOOSECOLORITEMS = 28;

  private static final int LAYOUT_CHOOSECOLORS = 29;

  private static final int LAYOUT_CHOOSEPROFILEOPTIONS = 30;

  private static final int LAYOUT_CONFIRMBOOKINGDATEPICKER = 31;

  private static final int LAYOUT_CONFIRMBOOKINGFRAGMENT = 32;

  private static final int LAYOUT_CONFIRMBOOKINGTIMEPICKER = 33;

  private static final int LAYOUT_CONTACTUSFRAGMENT = 34;

  private static final int LAYOUT_DASHBOARDEVENTSITEMS = 35;

  private static final int LAYOUT_DASHBOARDFRAGMENT = 36;

  private static final int LAYOUT_DASHBOARDITEMS = 37;

  private static final int LAYOUT_DASHBOARDITEMSTEMP = 38;

  private static final int LAYOUT_DASHSELECTEDEVENTS = 39;

  private static final int LAYOUT_DELETEACCOUNTALERT = 40;

  private static final int LAYOUT_DELETEPOSTPROFILE = 41;

  private static final int LAYOUT_DELETESWIPEALERT = 42;

  private static final int LAYOUT_EDITFRONTPAGEFRAGMENT = 43;

  private static final int LAYOUT_EDITORDELETEPROFILE = 44;

  private static final int LAYOUT_EDITPROFILEFRAGMENT = 45;

  private static final int LAYOUT_EMAILVERIFYFRAGMENT = 46;

  private static final int LAYOUT_FAVDETAILSCHOOSEOPTIONS = 47;

  private static final int LAYOUT_FAVDETAILSFRAGMENT = 48;

  private static final int LAYOUT_FAVTEMP = 49;

  private static final int LAYOUT_FAVOURITESFRAGMENT = 50;

  private static final int LAYOUT_FAVOURITESLISTITEMS = 51;

  private static final int LAYOUT_FILTERCATERGORIESITEM = 52;

  private static final int LAYOUT_FILTERFRAGMENT = 53;

  private static final int LAYOUT_FONTSLISTFRAGMENT = 54;

  private static final int LAYOUT_FONTSLISTITEM = 55;

  private static final int LAYOUT_FORGOTPASSWORDFRAGMENT = 56;

  private static final int LAYOUT_FRAGMENTDETAILSCATEGEROY = 57;

  private static final int LAYOUT_FRAGMENTOPENCATEGEROY = 58;

  private static final int LAYOUT_FRAGMENTREPORTCHOOSEOPTION = 59;

  private static final int LAYOUT_FRAGMENTREPORTCHOOSEOPTIONITEMS = 60;

  private static final int LAYOUT_FRAGMENTSELECTCATEGORY = 61;

  private static final int LAYOUT_LOGINFRAGMENT = 62;

  private static final int LAYOUT_LOGOUTALERT = 63;

  private static final int LAYOUT_MESSAGESFRAGMENT = 64;

  private static final int LAYOUT_MESSAGESUSERLIST = 65;

  private static final int LAYOUT_MYPROIFLEFRAGMENT = 66;

  private static final int LAYOUT_OPENCAMERAANDGALLERY = 67;

  private static final int LAYOUT_PICTURESFRAGMENT = 68;

  private static final int LAYOUT_PICTURESITEMLIST = 69;

  private static final int LAYOUT_PICTURESITEMUPLOADIMAGEVIDEOS = 70;

  private static final int LAYOUT_POSTPROFILEFRAGMENT = 71;

  private static final int LAYOUT_PREMIUMEDITPROFILEFRAGMENT = 72;

  private static final int LAYOUT_PRIVACYPOLICYFRAGMENT = 73;

  private static final int LAYOUT_PROGRESSLAYOUT = 74;

  private static final int LAYOUT_QRCODEGENERATEFRAGMENT = 75;

  private static final int LAYOUT_QRCODESCANNERFRAGMENT = 76;

  private static final int LAYOUT_QUESTIONARIESFRAGMENT = 77;

  private static final int LAYOUT_REPORTFRAGMENT = 78;

  private static final int LAYOUT_REPOSITORYALERT = 79;

  private static final int LAYOUT_SELECTEDCATEORIESITEMS = 80;

  private static final int LAYOUT_SETTINGSFRAGMENT = 81;

  private static final int LAYOUT_SHOWPICTUREVIDEOFRAGMENT = 82;

  private static final int LAYOUT_SIGNUPFRAGMENT = 83;

  private static final int LAYOUT_SLECTCATEITEMS = 84;

  private static final int LAYOUT_SPLASHFRAGMENT = 85;

  private static final int LAYOUT_TERMSUSEFRAGMENT = 86;

  private static final int LAYOUT_THANKYOUFRAGMENT = 87;

  private static final int LAYOUT_UPDATEEMAILFRAGMENT = 88;

  private static final int LAYOUT_UPGRADEPROFRAGMENT = 89;

  private static final int LAYOUT_VERIFYEMAILFRAGMENT = 90;

  private static final int LAYOUT_VIEWPROFILEFRAGMENT = 91;

  private static final int LAYOUT_VIEWPROFILEIMAGESLIST = 92;

  private static final int LAYOUT_VIEWPROFILECHOOSEOPTION = 93;

  private static final int LAYOUT_WELCOMEFRAGMENT = 94;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(94);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.add_cities_fragment, LAYOUT_ADDCITIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.add_images_view_profile, LAYOUT_ADDIMAGESVIEWPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.add_photos_fragment, LAYOUT_ADDPHOTOSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.add_photos_item_list, LAYOUT_ADDPHOTOSITEMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.add_question_items, LAYOUT_ADDQUESTIONITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.add_questions, LAYOUT_ADDQUESTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_edit_look_fragment, LAYOUT_ADVANCEEDITLOOKFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_map_bottom_sheet, LAYOUT_ADVANCEMAPBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_map_fragment, LAYOUT_ADVANCEMAPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_sett_gallery_frament_fragment, LAYOUT_ADVANCESETTGALLERYFRAMENTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_setting_fragment, LAYOUT_ADVANCESETTINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_setting_map_fragment, LAYOUT_ADVANCESETTINGMAPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.advance_show_view_profile, LAYOUT_ADVANCESHOWVIEWPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.alert_exit, LAYOUT_ALERTEXIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.block_user_profile, LAYOUT_BLOCKUSERPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.booking_details_fragment, LAYOUT_BOOKINGDETAILSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.calendar_fragment, LAYOUT_CALENDARFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.calendar_list_item, LAYOUT_CALENDARLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.camera_and_gallery_edit_profile, LAYOUT_CAMERAANDGALLERYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.categories_list_fragment, LAYOUT_CATEGORIESLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.categories_list_items, LAYOUT_CATEGORIESLISTITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.categories_temp, LAYOUT_CATEGORIESTEMP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.change_password_fragment, LAYOUT_CHANGEPASSWORDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.chat_fragment, LAYOUT_CHATFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.chat_receiver, LAYOUT_CHATRECEIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.chat_sender, LAYOUT_CHATSENDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.choose_color_items, LAYOUT_CHOOSECOLORITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.choose_colors, LAYOUT_CHOOSECOLORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.choose_profile_options, LAYOUT_CHOOSEPROFILEOPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.confirm_booking_datepicker, LAYOUT_CONFIRMBOOKINGDATEPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.confirm_booking_fragment, LAYOUT_CONFIRMBOOKINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.confirm_booking_timepicker, LAYOUT_CONFIRMBOOKINGTIMEPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.contact_us_fragment, LAYOUT_CONTACTUSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.dash_board_events_items, LAYOUT_DASHBOARDEVENTSITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.dash_board_fragment, LAYOUT_DASHBOARDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.dash_board_items, LAYOUT_DASHBOARDITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.dash_board_items_temp, LAYOUT_DASHBOARDITEMSTEMP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.dash_selected_events, LAYOUT_DASHSELECTEDEVENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.delete_account_alert, LAYOUT_DELETEACCOUNTALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.delete_postprofile, LAYOUT_DELETEPOSTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.delete_swipe_alert, LAYOUT_DELETESWIPEALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.edit_front_page_fragment, LAYOUT_EDITFRONTPAGEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.edit_or_delete_profile, LAYOUT_EDITORDELETEPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.edit_profile_fragment, LAYOUT_EDITPROFILEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.email_verify_fragment, LAYOUT_EMAILVERIFYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fav_details_choose_options, LAYOUT_FAVDETAILSCHOOSEOPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fav_details_fragment, LAYOUT_FAVDETAILSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fav_temp, LAYOUT_FAVTEMP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.favourites_fragment, LAYOUT_FAVOURITESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.favourites_list_items, LAYOUT_FAVOURITESLISTITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.filter_catergories_item, LAYOUT_FILTERCATERGORIESITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.filter_fragment, LAYOUT_FILTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fonts_list_fragment, LAYOUT_FONTSLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fonts_list_item, LAYOUT_FONTSLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.forgot_password_fragment, LAYOUT_FORGOTPASSWORDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fragment_details_categeroy, LAYOUT_FRAGMENTDETAILSCATEGEROY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fragment_open_categeroy, LAYOUT_FRAGMENTOPENCATEGEROY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fragment_report_choose_option, LAYOUT_FRAGMENTREPORTCHOOSEOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fragment_report_choose_option_items, LAYOUT_FRAGMENTREPORTCHOOSEOPTIONITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.fragment_select_category, LAYOUT_FRAGMENTSELECTCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.login_fragment, LAYOUT_LOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.logout_alert, LAYOUT_LOGOUTALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.messages_fragment, LAYOUT_MESSAGESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.messages_user_list, LAYOUT_MESSAGESUSERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.my_proifle_fragment, LAYOUT_MYPROIFLEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.open_camera_and_gallery, LAYOUT_OPENCAMERAANDGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.pictures_fragment, LAYOUT_PICTURESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.pictures_item_list, LAYOUT_PICTURESITEMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.pictures_item_upload_image_videos, LAYOUT_PICTURESITEMUPLOADIMAGEVIDEOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.post_profile_fragment, LAYOUT_POSTPROFILEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.premium_edit_profile_fragment, LAYOUT_PREMIUMEDITPROFILEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.privacy_policy_fragment, LAYOUT_PRIVACYPOLICYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.progress_layout, LAYOUT_PROGRESSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.qr_code_generate_fragment, LAYOUT_QRCODEGENERATEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.qr_code_scanner_fragment, LAYOUT_QRCODESCANNERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.questionaries_fragment, LAYOUT_QUESTIONARIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.report_fragment, LAYOUT_REPORTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.repository_alert, LAYOUT_REPOSITORYALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.selected_cateories_items, LAYOUT_SELECTEDCATEORIESITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.settings_fragment, LAYOUT_SETTINGSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.show_picture_video_fragment, LAYOUT_SHOWPICTUREVIDEOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.signup_fragment, LAYOUT_SIGNUPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.slect_cate_items, LAYOUT_SLECTCATEITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.splash_fragment, LAYOUT_SPLASHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.terms_use_fragment, LAYOUT_TERMSUSEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.thank_you_fragment, LAYOUT_THANKYOUFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.update_email_fragment, LAYOUT_UPDATEEMAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.upgrade_pro_fragment, LAYOUT_UPGRADEPROFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.verify_email_fragment, LAYOUT_VERIFYEMAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.view_profile_fragment, LAYOUT_VIEWPROFILEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.view_profile_images_list, LAYOUT_VIEWPROFILEIMAGESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.viewprofile_chooseoption, LAYOUT_VIEWPROFILECHOOSEOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.plazapalm.R.layout.welcome_fragment, LAYOUT_WELCOMEFRAGMENT);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDCITIESFRAGMENT: {
        if ("layout/add_cities_fragment_0".equals(tag)) {
          return new AddCitiesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_cities_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDIMAGESVIEWPROFILE: {
        if ("layout/add_images_view_profile_0".equals(tag)) {
          return new AddImagesViewProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_images_view_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDPHOTOSFRAGMENT: {
        if ("layout/add_photos_fragment_0".equals(tag)) {
          return new AddPhotosFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_photos_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDPHOTOSITEMLIST: {
        if ("layout/add_photos_item_list_0".equals(tag)) {
          return new AddPhotosItemListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_photos_item_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDQUESTIONITEMS: {
        if ("layout/add_question_items_0".equals(tag)) {
          return new AddQuestionItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_question_items is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDQUESTIONS: {
        if ("layout/add_questions_0".equals(tag)) {
          return new AddQuestionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_questions is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCEEDITLOOKFRAGMENT: {
        if ("layout/advance_edit_look_fragment_0".equals(tag)) {
          return new AdvanceEditLookFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_edit_look_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCEMAPBOTTOMSHEET: {
        if ("layout/advance_map_bottom_sheet_0".equals(tag)) {
          return new AdvanceMapBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_map_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCEMAPFRAGMENT: {
        if ("layout/advance_map_fragment_0".equals(tag)) {
          return new AdvanceMapFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_map_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCESETTGALLERYFRAMENTFRAGMENT: {
        if ("layout/advance_sett_gallery_frament_fragment_0".equals(tag)) {
          return new AdvanceSettGalleryFramentFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_sett_gallery_frament_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCESETTINGFRAGMENT: {
        if ("layout/advance_setting_fragment_0".equals(tag)) {
          return new AdvanceSettingFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_setting_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCESETTINGMAPFRAGMENT: {
        if ("layout/advance_setting_map_fragment_0".equals(tag)) {
          return new AdvanceSettingMapFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_setting_map_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ADVANCESHOWVIEWPROFILE: {
        if ("layout/advance_show_view_profile_0".equals(tag)) {
          return new AdvanceShowViewProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for advance_show_view_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ALERTEXIT: {
        if ("layout/alert_exit_0".equals(tag)) {
          return new AlertExitBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for alert_exit is invalid. Received: " + tag);
      }
      case  LAYOUT_BLOCKUSERPROFILE: {
        if ("layout/block_user_profile_0".equals(tag)) {
          return new BlockUserProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for block_user_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_BOOKINGDETAILSFRAGMENT: {
        if ("layout/booking_details_fragment_0".equals(tag)) {
          return new BookingDetailsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for booking_details_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CALENDARFRAGMENT: {
        if ("layout/calendar_fragment_0".equals(tag)) {
          return new CalendarFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for calendar_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CALENDARLISTITEM: {
        if ("layout/calendar_list_item_0".equals(tag)) {
          return new CalendarListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for calendar_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CAMERAANDGALLERYEDITPROFILE: {
        if ("layout/camera_and_gallery_edit_profile_0".equals(tag)) {
          return new CameraAndGalleryEditProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for camera_and_gallery_edit_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_CATEGORIESLISTFRAGMENT: {
        if ("layout/categories_list_fragment_0".equals(tag)) {
          return new CategoriesListFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for categories_list_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CATEGORIESLISTITEMS: {
        if ("layout/categories_list_items_0".equals(tag)) {
          return new CategoriesListItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for categories_list_items is invalid. Received: " + tag);
      }
      case  LAYOUT_CATEGORIESTEMP: {
        if ("layout/categories_temp_0".equals(tag)) {
          return new CategoriesTempBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for categories_temp is invalid. Received: " + tag);
      }
      case  LAYOUT_CHANGEPASSWORDFRAGMENT: {
        if ("layout/change_password_fragment_0".equals(tag)) {
          return new ChangePasswordFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for change_password_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATFRAGMENT: {
        if ("layout/chat_fragment_0".equals(tag)) {
          return new ChatFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATRECEIVER: {
        if ("layout/chat_receiver_0".equals(tag)) {
          return new ChatReceiverBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_receiver is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATSENDER: {
        if ("layout/chat_sender_0".equals(tag)) {
          return new ChatSenderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_sender is invalid. Received: " + tag);
      }
      case  LAYOUT_CHOOSECOLORITEMS: {
        if ("layout/choose_color_items_0".equals(tag)) {
          return new ChooseColorItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for choose_color_items is invalid. Received: " + tag);
      }
      case  LAYOUT_CHOOSECOLORS: {
        if ("layout/choose_colors_0".equals(tag)) {
          return new ChooseColorsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for choose_colors is invalid. Received: " + tag);
      }
      case  LAYOUT_CHOOSEPROFILEOPTIONS: {
        if ("layout/choose_profile_options_0".equals(tag)) {
          return new ChooseProfileOptionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for choose_profile_options is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFIRMBOOKINGDATEPICKER: {
        if ("layout/confirm_booking_datepicker_0".equals(tag)) {
          return new ConfirmBookingDatepickerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for confirm_booking_datepicker is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFIRMBOOKINGFRAGMENT: {
        if ("layout/confirm_booking_fragment_0".equals(tag)) {
          return new ConfirmBookingFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for confirm_booking_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFIRMBOOKINGTIMEPICKER: {
        if ("layout/confirm_booking_timepicker_0".equals(tag)) {
          return new ConfirmBookingTimepickerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for confirm_booking_timepicker is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTUSFRAGMENT: {
        if ("layout/contact_us_fragment_0".equals(tag)) {
          return new ContactUsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_us_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_DASHBOARDEVENTSITEMS: {
        if ("layout/dash_board_events_items_0".equals(tag)) {
          return new DashBoardEventsItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dash_board_events_items is invalid. Received: " + tag);
      }
      case  LAYOUT_DASHBOARDFRAGMENT: {
        if ("layout/dash_board_fragment_0".equals(tag)) {
          return new DashBoardFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dash_board_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_DASHBOARDITEMS: {
        if ("layout/dash_board_items_0".equals(tag)) {
          return new DashBoardItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dash_board_items is invalid. Received: " + tag);
      }
      case  LAYOUT_DASHBOARDITEMSTEMP: {
        if ("layout/dash_board_items_temp_0".equals(tag)) {
          return new DashBoardItemsTempBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dash_board_items_temp is invalid. Received: " + tag);
      }
      case  LAYOUT_DASHSELECTEDEVENTS: {
        if ("layout/dash_selected_events_0".equals(tag)) {
          return new DashSelectedEventsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dash_selected_events is invalid. Received: " + tag);
      }
      case  LAYOUT_DELETEACCOUNTALERT: {
        if ("layout/delete_account_alert_0".equals(tag)) {
          return new DeleteAccountAlertBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delete_account_alert is invalid. Received: " + tag);
      }
      case  LAYOUT_DELETEPOSTPROFILE: {
        if ("layout/delete_postprofile_0".equals(tag)) {
          return new DeletePostprofileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delete_postprofile is invalid. Received: " + tag);
      }
      case  LAYOUT_DELETESWIPEALERT: {
        if ("layout/delete_swipe_alert_0".equals(tag)) {
          return new DeleteSwipeAlertBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delete_swipe_alert is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITFRONTPAGEFRAGMENT: {
        if ("layout/edit_front_page_fragment_0".equals(tag)) {
          return new EditFrontPageFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_front_page_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITORDELETEPROFILE: {
        if ("layout/edit_or_delete_profile_0".equals(tag)) {
          return new EditOrDeleteProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_or_delete_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITPROFILEFRAGMENT: {
        if ("layout/edit_profile_fragment_0".equals(tag)) {
          return new EditProfileFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_profile_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_EMAILVERIFYFRAGMENT: {
        if ("layout/email_verify_fragment_0".equals(tag)) {
          return new EmailVerifyFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for email_verify_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FAVDETAILSCHOOSEOPTIONS: {
        if ("layout/fav_details_choose_options_0".equals(tag)) {
          return new FavDetailsChooseOptionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fav_details_choose_options is invalid. Received: " + tag);
      }
      case  LAYOUT_FAVDETAILSFRAGMENT: {
        if ("layout/fav_details_fragment_0".equals(tag)) {
          return new FavDetailsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fav_details_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FAVTEMP: {
        if ("layout/fav_temp_0".equals(tag)) {
          return new FavTempBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fav_temp is invalid. Received: " + tag);
      }
      case  LAYOUT_FAVOURITESFRAGMENT: {
        if ("layout/favourites_fragment_0".equals(tag)) {
          return new FavouritesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for favourites_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_FAVOURITESLISTITEMS: {
        if ("layout/favourites_list_items_0".equals(tag)) {
          return new FavouritesListItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for favourites_list_items is invalid. Received: " + tag);
      }
      case  LAYOUT_FILTERCATERGORIESITEM: {
        if ("layout/filter_catergories_item_0".equals(tag)) {
          return new FilterCatergoriesItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for filter_catergories_item is invalid. Received: " + tag);
      }
      case  LAYOUT_FILTERFRAGMENT: {
        if ("layout/filter_fragment_0".equals(tag)) {
          return new FilterFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for filter_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FONTSLISTFRAGMENT: {
        if ("layout/fonts_list_fragment_0".equals(tag)) {
          return new FontsListFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fonts_list_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FONTSLISTITEM: {
        if ("layout/fonts_list_item_0".equals(tag)) {
          return new FontsListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fonts_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_FORGOTPASSWORDFRAGMENT: {
        if ("layout/forgot_password_fragment_0".equals(tag)) {
          return new ForgotPasswordFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for forgot_password_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILSCATEGEROY: {
        if ("layout/fragment_details_categeroy_0".equals(tag)) {
          return new FragmentDetailsCategeroyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_details_categeroy is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOPENCATEGEROY: {
        if ("layout/fragment_open_categeroy_0".equals(tag)) {
          return new FragmentOpenCategeroyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_open_categeroy is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTCHOOSEOPTION: {
        if ("layout/fragment_report_choose_option_0".equals(tag)) {
          return new FragmentReportChooseOptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_choose_option is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTCHOOSEOPTIONITEMS: {
        if ("layout/fragment_report_choose_option_items_0".equals(tag)) {
          return new FragmentReportChooseOptionItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_choose_option_items is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSELECTCATEGORY: {
        if ("layout/fragment_select_category_0".equals(tag)) {
          return new FragmentSelectCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_select_category is invalid. Received: " + tag);
      }
      case  LAYOUT_LOGINFRAGMENT: {
        if ("layout/login_fragment_0".equals(tag)) {
          return new LoginFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for login_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LOGOUTALERT: {
        if ("layout/logout_alert_0".equals(tag)) {
          return new LogoutAlertBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for logout_alert is invalid. Received: " + tag);
      }
      case  LAYOUT_MESSAGESFRAGMENT: {
        if ("layout/messages_fragment_0".equals(tag)) {
          return new MessagesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for messages_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_MESSAGESUSERLIST: {
        if ("layout/messages_user_list_0".equals(tag)) {
          return new MessagesUserListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for messages_user_list is invalid. Received: " + tag);
      }
      case  LAYOUT_MYPROIFLEFRAGMENT: {
        if ("layout/my_proifle_fragment_0".equals(tag)) {
          return new MyProifleFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for my_proifle_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_OPENCAMERAANDGALLERY: {
        if ("layout/open_camera_and_gallery_0".equals(tag)) {
          return new OpenCameraAndGalleryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for open_camera_and_gallery is invalid. Received: " + tag);
      }
      case  LAYOUT_PICTURESFRAGMENT: {
        if ("layout/pictures_fragment_0".equals(tag)) {
          return new PicturesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for pictures_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_PICTURESITEMLIST: {
        if ("layout/pictures_item_list_0".equals(tag)) {
          return new PicturesItemListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for pictures_item_list is invalid. Received: " + tag);
      }
      case  LAYOUT_PICTURESITEMUPLOADIMAGEVIDEOS: {
        if ("layout/pictures_item_upload_image_videos_0".equals(tag)) {
          return new PicturesItemUploadImageVideosBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for pictures_item_upload_image_videos is invalid. Received: " + tag);
      }
      case  LAYOUT_POSTPROFILEFRAGMENT: {
        if ("layout/post_profile_fragment_0".equals(tag)) {
          return new PostProfileFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for post_profile_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_PREMIUMEDITPROFILEFRAGMENT: {
        if ("layout/premium_edit_profile_fragment_0".equals(tag)) {
          return new PremiumEditProfileFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for premium_edit_profile_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_PRIVACYPOLICYFRAGMENT: {
        if ("layout/privacy_policy_fragment_0".equals(tag)) {
          return new PrivacyPolicyFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for privacy_policy_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_PROGRESSLAYOUT: {
        if ("layout/progress_layout_0".equals(tag)) {
          return new ProgressLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for progress_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QRCODEGENERATEFRAGMENT: {
        if ("layout/qr_code_generate_fragment_0".equals(tag)) {
          return new QrCodeGenerateFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for qr_code_generate_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_QRCODESCANNERFRAGMENT: {
        if ("layout/qr_code_scanner_fragment_0".equals(tag)) {
          return new QrCodeScannerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for qr_code_scanner_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_QUESTIONARIESFRAGMENT: {
        if ("layout/questionaries_fragment_0".equals(tag)) {
          return new QuestionariesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for questionaries_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_REPORTFRAGMENT: {
        if ("layout/report_fragment_0".equals(tag)) {
          return new ReportFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for report_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_REPOSITORYALERT: {
        if ("layout/repository_alert_0".equals(tag)) {
          return new RepositoryAlertBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for repository_alert is invalid. Received: " + tag);
      }
      case  LAYOUT_SELECTEDCATEORIESITEMS: {
        if ("layout/selected_cateories_items_0".equals(tag)) {
          return new SelectedCateoriesItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for selected_cateories_items is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSFRAGMENT: {
        if ("layout/settings_fragment_0".equals(tag)) {
          return new SettingsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SHOWPICTUREVIDEOFRAGMENT: {
        if ("layout/show_picture_video_fragment_0".equals(tag)) {
          return new ShowPictureVideoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for show_picture_video_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SIGNUPFRAGMENT: {
        if ("layout/signup_fragment_0".equals(tag)) {
          return new SignupFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for signup_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SLECTCATEITEMS: {
        if ("layout/slect_cate_items_0".equals(tag)) {
          return new SlectCateItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for slect_cate_items is invalid. Received: " + tag);
      }
      case  LAYOUT_SPLASHFRAGMENT: {
        if ("layout/splash_fragment_0".equals(tag)) {
          return new SplashFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for splash_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TERMSUSEFRAGMENT: {
        if ("layout/terms_use_fragment_0".equals(tag)) {
          return new TermsUseFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for terms_use_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_THANKYOUFRAGMENT: {
        if ("layout/thank_you_fragment_0".equals(tag)) {
          return new ThankYouFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for thank_you_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_UPDATEEMAILFRAGMENT: {
        if ("layout/update_email_fragment_0".equals(tag)) {
          return new UpdateEmailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for update_email_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_UPGRADEPROFRAGMENT: {
        if ("layout/upgrade_pro_fragment_0".equals(tag)) {
          return new UpgradeProFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upgrade_pro_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VERIFYEMAILFRAGMENT: {
        if ("layout/verify_email_fragment_0".equals(tag)) {
          return new VerifyEmailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for verify_email_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWPROFILEFRAGMENT: {
        if ("layout/view_profile_fragment_0".equals(tag)) {
          return new ViewProfileFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_profile_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWPROFILEIMAGESLIST: {
        if ("layout/view_profile_images_list_0".equals(tag)) {
          return new ViewProfileImagesListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_profile_images_list is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWPROFILECHOOSEOPTION: {
        if ("layout/viewprofile_chooseoption_0".equals(tag)) {
          return new ViewprofileChooseoptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for viewprofile_chooseoption is invalid. Received: " + tag);
      }
      case  LAYOUT_WELCOMEFRAGMENT: {
        if ("layout/welcome_fragment_0".equals(tag)) {
          return new WelcomeFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for welcome_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(1, "ImageURL");
      sKeys.put(0, "_all");
      sKeys.put(2, "categoryName");
      sKeys.put(3, "getmodel");
      sKeys.put(4, "isCheckedStatus");
      sKeys.put(5, "model");
      sKeys.put(6, "vm");
      sKeys.put(7, "vmi");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(94);

    static {
      sKeys.put("layout/activity_main_0", com.example.plazapalm.R.layout.activity_main);
      sKeys.put("layout/add_cities_fragment_0", com.example.plazapalm.R.layout.add_cities_fragment);
      sKeys.put("layout/add_images_view_profile_0", com.example.plazapalm.R.layout.add_images_view_profile);
      sKeys.put("layout/add_photos_fragment_0", com.example.plazapalm.R.layout.add_photos_fragment);
      sKeys.put("layout/add_photos_item_list_0", com.example.plazapalm.R.layout.add_photos_item_list);
      sKeys.put("layout/add_question_items_0", com.example.plazapalm.R.layout.add_question_items);
      sKeys.put("layout/add_questions_0", com.example.plazapalm.R.layout.add_questions);
      sKeys.put("layout/advance_edit_look_fragment_0", com.example.plazapalm.R.layout.advance_edit_look_fragment);
      sKeys.put("layout/advance_map_bottom_sheet_0", com.example.plazapalm.R.layout.advance_map_bottom_sheet);
      sKeys.put("layout/advance_map_fragment_0", com.example.plazapalm.R.layout.advance_map_fragment);
      sKeys.put("layout/advance_sett_gallery_frament_fragment_0", com.example.plazapalm.R.layout.advance_sett_gallery_frament_fragment);
      sKeys.put("layout/advance_setting_fragment_0", com.example.plazapalm.R.layout.advance_setting_fragment);
      sKeys.put("layout/advance_setting_map_fragment_0", com.example.plazapalm.R.layout.advance_setting_map_fragment);
      sKeys.put("layout/advance_show_view_profile_0", com.example.plazapalm.R.layout.advance_show_view_profile);
      sKeys.put("layout/alert_exit_0", com.example.plazapalm.R.layout.alert_exit);
      sKeys.put("layout/block_user_profile_0", com.example.plazapalm.R.layout.block_user_profile);
      sKeys.put("layout/booking_details_fragment_0", com.example.plazapalm.R.layout.booking_details_fragment);
      sKeys.put("layout/calendar_fragment_0", com.example.plazapalm.R.layout.calendar_fragment);
      sKeys.put("layout/calendar_list_item_0", com.example.plazapalm.R.layout.calendar_list_item);
      sKeys.put("layout/camera_and_gallery_edit_profile_0", com.example.plazapalm.R.layout.camera_and_gallery_edit_profile);
      sKeys.put("layout/categories_list_fragment_0", com.example.plazapalm.R.layout.categories_list_fragment);
      sKeys.put("layout/categories_list_items_0", com.example.plazapalm.R.layout.categories_list_items);
      sKeys.put("layout/categories_temp_0", com.example.plazapalm.R.layout.categories_temp);
      sKeys.put("layout/change_password_fragment_0", com.example.plazapalm.R.layout.change_password_fragment);
      sKeys.put("layout/chat_fragment_0", com.example.plazapalm.R.layout.chat_fragment);
      sKeys.put("layout/chat_receiver_0", com.example.plazapalm.R.layout.chat_receiver);
      sKeys.put("layout/chat_sender_0", com.example.plazapalm.R.layout.chat_sender);
      sKeys.put("layout/choose_color_items_0", com.example.plazapalm.R.layout.choose_color_items);
      sKeys.put("layout/choose_colors_0", com.example.plazapalm.R.layout.choose_colors);
      sKeys.put("layout/choose_profile_options_0", com.example.plazapalm.R.layout.choose_profile_options);
      sKeys.put("layout/confirm_booking_datepicker_0", com.example.plazapalm.R.layout.confirm_booking_datepicker);
      sKeys.put("layout/confirm_booking_fragment_0", com.example.plazapalm.R.layout.confirm_booking_fragment);
      sKeys.put("layout/confirm_booking_timepicker_0", com.example.plazapalm.R.layout.confirm_booking_timepicker);
      sKeys.put("layout/contact_us_fragment_0", com.example.plazapalm.R.layout.contact_us_fragment);
      sKeys.put("layout/dash_board_events_items_0", com.example.plazapalm.R.layout.dash_board_events_items);
      sKeys.put("layout/dash_board_fragment_0", com.example.plazapalm.R.layout.dash_board_fragment);
      sKeys.put("layout/dash_board_items_0", com.example.plazapalm.R.layout.dash_board_items);
      sKeys.put("layout/dash_board_items_temp_0", com.example.plazapalm.R.layout.dash_board_items_temp);
      sKeys.put("layout/dash_selected_events_0", com.example.plazapalm.R.layout.dash_selected_events);
      sKeys.put("layout/delete_account_alert_0", com.example.plazapalm.R.layout.delete_account_alert);
      sKeys.put("layout/delete_postprofile_0", com.example.plazapalm.R.layout.delete_postprofile);
      sKeys.put("layout/delete_swipe_alert_0", com.example.plazapalm.R.layout.delete_swipe_alert);
      sKeys.put("layout/edit_front_page_fragment_0", com.example.plazapalm.R.layout.edit_front_page_fragment);
      sKeys.put("layout/edit_or_delete_profile_0", com.example.plazapalm.R.layout.edit_or_delete_profile);
      sKeys.put("layout/edit_profile_fragment_0", com.example.plazapalm.R.layout.edit_profile_fragment);
      sKeys.put("layout/email_verify_fragment_0", com.example.plazapalm.R.layout.email_verify_fragment);
      sKeys.put("layout/fav_details_choose_options_0", com.example.plazapalm.R.layout.fav_details_choose_options);
      sKeys.put("layout/fav_details_fragment_0", com.example.plazapalm.R.layout.fav_details_fragment);
      sKeys.put("layout/fav_temp_0", com.example.plazapalm.R.layout.fav_temp);
      sKeys.put("layout/favourites_fragment_0", com.example.plazapalm.R.layout.favourites_fragment);
      sKeys.put("layout/favourites_list_items_0", com.example.plazapalm.R.layout.favourites_list_items);
      sKeys.put("layout/filter_catergories_item_0", com.example.plazapalm.R.layout.filter_catergories_item);
      sKeys.put("layout/filter_fragment_0", com.example.plazapalm.R.layout.filter_fragment);
      sKeys.put("layout/fonts_list_fragment_0", com.example.plazapalm.R.layout.fonts_list_fragment);
      sKeys.put("layout/fonts_list_item_0", com.example.plazapalm.R.layout.fonts_list_item);
      sKeys.put("layout/forgot_password_fragment_0", com.example.plazapalm.R.layout.forgot_password_fragment);
      sKeys.put("layout/fragment_details_categeroy_0", com.example.plazapalm.R.layout.fragment_details_categeroy);
      sKeys.put("layout/fragment_open_categeroy_0", com.example.plazapalm.R.layout.fragment_open_categeroy);
      sKeys.put("layout/fragment_report_choose_option_0", com.example.plazapalm.R.layout.fragment_report_choose_option);
      sKeys.put("layout/fragment_report_choose_option_items_0", com.example.plazapalm.R.layout.fragment_report_choose_option_items);
      sKeys.put("layout/fragment_select_category_0", com.example.plazapalm.R.layout.fragment_select_category);
      sKeys.put("layout/login_fragment_0", com.example.plazapalm.R.layout.login_fragment);
      sKeys.put("layout/logout_alert_0", com.example.plazapalm.R.layout.logout_alert);
      sKeys.put("layout/messages_fragment_0", com.example.plazapalm.R.layout.messages_fragment);
      sKeys.put("layout/messages_user_list_0", com.example.plazapalm.R.layout.messages_user_list);
      sKeys.put("layout/my_proifle_fragment_0", com.example.plazapalm.R.layout.my_proifle_fragment);
      sKeys.put("layout/open_camera_and_gallery_0", com.example.plazapalm.R.layout.open_camera_and_gallery);
      sKeys.put("layout/pictures_fragment_0", com.example.plazapalm.R.layout.pictures_fragment);
      sKeys.put("layout/pictures_item_list_0", com.example.plazapalm.R.layout.pictures_item_list);
      sKeys.put("layout/pictures_item_upload_image_videos_0", com.example.plazapalm.R.layout.pictures_item_upload_image_videos);
      sKeys.put("layout/post_profile_fragment_0", com.example.plazapalm.R.layout.post_profile_fragment);
      sKeys.put("layout/premium_edit_profile_fragment_0", com.example.plazapalm.R.layout.premium_edit_profile_fragment);
      sKeys.put("layout/privacy_policy_fragment_0", com.example.plazapalm.R.layout.privacy_policy_fragment);
      sKeys.put("layout/progress_layout_0", com.example.plazapalm.R.layout.progress_layout);
      sKeys.put("layout/qr_code_generate_fragment_0", com.example.plazapalm.R.layout.qr_code_generate_fragment);
      sKeys.put("layout/qr_code_scanner_fragment_0", com.example.plazapalm.R.layout.qr_code_scanner_fragment);
      sKeys.put("layout/questionaries_fragment_0", com.example.plazapalm.R.layout.questionaries_fragment);
      sKeys.put("layout/report_fragment_0", com.example.plazapalm.R.layout.report_fragment);
      sKeys.put("layout/repository_alert_0", com.example.plazapalm.R.layout.repository_alert);
      sKeys.put("layout/selected_cateories_items_0", com.example.plazapalm.R.layout.selected_cateories_items);
      sKeys.put("layout/settings_fragment_0", com.example.plazapalm.R.layout.settings_fragment);
      sKeys.put("layout/show_picture_video_fragment_0", com.example.plazapalm.R.layout.show_picture_video_fragment);
      sKeys.put("layout/signup_fragment_0", com.example.plazapalm.R.layout.signup_fragment);
      sKeys.put("layout/slect_cate_items_0", com.example.plazapalm.R.layout.slect_cate_items);
      sKeys.put("layout/splash_fragment_0", com.example.plazapalm.R.layout.splash_fragment);
      sKeys.put("layout/terms_use_fragment_0", com.example.plazapalm.R.layout.terms_use_fragment);
      sKeys.put("layout/thank_you_fragment_0", com.example.plazapalm.R.layout.thank_you_fragment);
      sKeys.put("layout/update_email_fragment_0", com.example.plazapalm.R.layout.update_email_fragment);
      sKeys.put("layout/upgrade_pro_fragment_0", com.example.plazapalm.R.layout.upgrade_pro_fragment);
      sKeys.put("layout/verify_email_fragment_0", com.example.plazapalm.R.layout.verify_email_fragment);
      sKeys.put("layout/view_profile_fragment_0", com.example.plazapalm.R.layout.view_profile_fragment);
      sKeys.put("layout/view_profile_images_list_0", com.example.plazapalm.R.layout.view_profile_images_list);
      sKeys.put("layout/viewprofile_chooseoption_0", com.example.plazapalm.R.layout.viewprofile_chooseoption);
      sKeys.put("layout/welcome_fragment_0", com.example.plazapalm.R.layout.welcome_fragment);
    }
  }
}
