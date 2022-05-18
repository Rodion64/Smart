package Cursach.Entities;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)//связь с пользователем по id user'a
    @JoinColumn(name = "user_id")
    private User userID;

    private int phoneCount = 1;
    private int catalogNumber;
    private int phoneNumber;

    public Phone() {
    }

    public Phone(User userID, int catalogNumber, int phoneNumber) {
        this.userID = userID;
        this.catalogNumber = catalogNumber;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }


    public int getPhoneCount() {
        return phoneCount;
    }

    public void setPhoneCount(int phoneCount) {
        this.phoneCount = phoneCount;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhotoAddress() {
        return "image/img_" + catalogNumber + "_" + phoneNumber + ".jpg";
    }//метод для определения пути к картинке

    public String getPhoneName() {//получение имени товара по номеру в каталоге

        switch (this.catalogNumber) {
            case 1:
                switch (this.phoneNumber) {
                    case 1:
                        return "Apple iPhone 13 Pro Max 128Gb Graphite";
                    case 2:
                        return "Apple iPhone SE (2020) 64Gb Black";
                    case 3:
                        return "Apple iPhone 12 128Gb Red";
                    case 4:
                        return "Apple iPhone 12 64Gb White";
                    case 5:
                        return "Apple iPhone 13 256Gb Midnight";
                    case 6:
                        return "Apple iPhone 12 64Gb Purple";
                    case 7:
                        return "Apple iPhone 13 256Gb Green";
                    case 8:
                        return "Apple iPhone 13 Mini 256Gb Red";
                    case 9:
                        return "Apple iPhone 13 Mini 128Gb / Blue";
                }
                break;
            case 2:
                switch (this.phoneNumber) {
                    case 1:
                        return "Samsung Galaxy A03 SM-A035F/DS 32Gb+3Gb LTE Black";
                    case 2:
                        return "Samsung Galaxy S22 (SM-S901B/DS) 256Gb+8Gb 5G White";
                    case 3:
                        return "Samsung Galaxy Note 20 Ultra (Snapdragon 865+) 256Gb+12Gb 5G Black";
                    case 4:
                        return "Samsung Galaxy S20 FE SM-G780G 128Gb+6Gb Dual LTE Red";
                    case 5:
                        return "Samsung Galaxy Z Flip 3 SM-F711B/DS 256Gb+8Gb Dual 5G Black";
                    case 6:
                        return "Samsung Galaxy S22 Ultra 256Gb+12Gb 5G Black";
                }
                break;
            case 3:
                switch (this.phoneNumber) {
                    case 1:
                        return "Honor 50 Lite 6+128GB Space Silver";
                    case 5:
                        return "Honor Magic 3 Pro 512Gb+12Gb Dual 5G White";
                }
                break;
            case 4:
                switch (this.phoneNumber) {
                    case 4:
                        return "HUAWEI P40 Pro lite";
                    case 5:
                        return "HUAWEI P40 Pro+";
                    case 6:
                        return "HUAWEI P40 Pro";
                }
                break;
            case 5:
                switch (this.phoneNumber) {
                    case 3:
                        return "Oneplus 9 256Gb+12Gb Dual 5G Purple";
                    case 4:
                        return "Oneplus Nord 2 5G 128Gb+8Gb Dual Blue";
                    case 5:
                        return "Oneplus 10 Pro 256Gb+8Gb Dual 5G Black";
                }
                break;
            case 6:
                if (this.phoneNumber == 7) {
                    return "Google Pixel 6 128Gb+8Gb Dual 5G Stormy Black";
                }
                break;
            default:
                return "";
        }
        return "";
    }

    public int getPhonePrices() {//получение цены товара по номеру в каталоге

        switch (this.catalogNumber) {
            case 1:
                switch (this.phoneNumber) {
                    case 1:
                        return 106180;
                    case 2:
                        return 39780;
                    case 3:
                        return 63580;
                    case 4:
                        return 54780;
                    case 5:
                        return 86480;
                    case 6:
                        return 59780;
                    case 7:
                        return 81780;
                    case 8:
                        return 76780;
                    case 9:
                        return 71780;
                }
                break;
            case 2:
                switch (this.phoneNumber) {
                    case 1:
                        return 12100;
                    case 2:
                        return 94350;
                    case 3:
                        return 102980;
                    case 4:
                        return 44950;
                    case 5:
                        return 87370;
                    case 6:
                        return 143110;
                }
                break;
            case 3:
                switch (this.phoneNumber) {
                    case 1:
                        return 21999;
                    case 5:
                        return 102980;
                }
                break;
            case 4:
                switch (this.phoneNumber) {
                    case 4:
                        return 23999;
                    case 5:
                        return 99999;
                    case 6:
                        return 69999;
                }
                break;
            case 5:
                switch (this.phoneNumber) {
                    case 3:
                        return 48980;
                    case 4:
                        return 38980;
                    case 5:
                        return 80980;
                }
                break;
            case 6:
                if (this.phoneNumber == 7) {
                    return 58980;
                }
                break;
            default:
                return 0;
        }
        return 0;
    }
}
