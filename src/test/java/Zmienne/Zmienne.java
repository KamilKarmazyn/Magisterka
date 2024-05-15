package Zmienne;

public class Zmienne {
    public static String value;

    //BLOG//
    public static String IconBlog = "//*[text()='Blog']";
    public static String TextRecentPosts = "//*[text()='Recent Posts'][1]";
    public static String ButtonRecentPosts = "//*[@id='recent-posts-2']/ul/li[1]/a";
    public static String TextRecentComments = "//*[text()='Recent Comments']";
    public static String ButtonRecentComments = "//*[@id='recentcomments']/li[1]/a";
    public static String TextArchives = "//*[text()='Archives']";
    public static String ButtonArchivesEle = "//*[@id='archives-2']/ul/li[1]";
    public static String TextCategories = "//*[text()='Categories']";
    public static String TextCatFashion = "//*[contains(text(),'Fashion')]";
    public static String TextMeta = "//*[text()='Meta']";
    public static String ButtonMetaEle = "//*[@id='meta-2']/ul/li[1]";
    public static String InputSearchArticle = "//div[@class='page-content']//input[@placeholder='Search …']";
    public static String ButtonSearchArticle = "//div[@class='page-content']//input[@value='Search']";
    ///BLOG//
    //Newsletter//
    public static String TextBoxName ="//input[contains(@autocomplete,'given-name')][1]";
    public static String ButtonPlaceOrder ="//input[@id='place_order']";
    public static String LabelThanksForPurhase ="//p[contains(@class,'thankyou')]";
    public static String TextBoxEmail ="//*[@id='es_txt_email']";
    public static String ButtonSubscribe = "//*[@id='es_txt_button']";
    ///Newsletter//
    //Tags//
    public static String ButtonTagsAutumn = "//*[@id='tag_cloud-1']/div/a[1]";
    public static String TextTags = "//*[@id='main']/header/h1";
    ///Tags//
    //Registery//
    public static String ButtonAccount = "//a[normalize-space()='Account']";
    public static String TextBoxREmail = "//input[@id='reg_email']";
    public static String TextBoxRPassword = "//input[@id='reg_password']";
    public static String ButtonRegistery = "//input[@name='register']";
    public static String TextWeakPassword = "//*[text()='Weak - Please enter a stronger password.']";
    public static String PopupWrongEmailR = "//*[@id='customer_login']/div[2]/form/p[2]";
    public static String TextBoxLEmail = "//input[@id='username']";
    public static String TextBoxLPassword = "//input[@id='password']";
    public static String ButtonLogin = "//input[@name='login']";
    public static String ButtonLogout = "//*[text()='Log out']";
    //ProductSearch//
    public static String ButtonMainMenu = "//*[normalize-space()='Generic Shop']";
    public static String TextFieldSearch = "//input[@id='search-field-top-bar']";
    public static String ButtonSearch = "//span[@class='fa fa-search']";
    public static String TextBoxProductNumber = "//input[@name='quantity']";
    public static String ButtonAddToCart = "//button[normalize-space()='Add to cart']";
    public static String ButtonCart = "//*[contains(text(),'My Cart')]";
    public static String ButtonPurchase = "//*[normalize-space()='Proceed to checkout']";
    public static String TextboxNameBiling = "//input[contains(@autocomplete,'given-name')][1]";

    public static String TextBoxLastNameBiling = "//input[contains(@autocomplete,'family-name')][1]";
    public static String TextBoxCompanyBiling = "//*[@id='billing_company']";
    public static String TextBoxStreetAdressBiling = "//input[@id='billing_address_1']";
    public static String TextBoxStreetAdressBiling2 = "//input[@id='billing_address_2']";
    public static String TextBoxZIPBiling = "//input[@id='billing_postcode']";
    public static String TextBoxTownBiling = "//input[@id='billing_city']";
    public static String TextBoxPhoneBiling = "//input[@id='billing_phone']";
    public static String TextBoxEmailBiling = "//input[@id='billing_email']";
    public static String TextBoxBilingPlaceOrder = "//*[@value='Place order']";

}
