package dk.cphbusiness.bank.contract.dto;

public class CustomerDetail extends CustomerIdentifier {
  private String title;
  private String firstName;
  private String lastName;
  private String street;
  private String postalCode;
  private String postalDistrict;
  private String phone;
  private String email;

    public CustomerDetail(
      String cpr,
      String title,
      String firstName,
      String lastName,
      String street,
      String postalCode,
      String postalDistrict,
      String phone,
      String email
      ) {
    super(cpr);
    this.title = title;
    this.firstName = firstName;
    this.lastName = lastName;
    this.street = street;
    this.postalCode = postalCode;
    this.postalDistrict = postalDistrict;
    this.phone = phone;
    this.email = email;
    }

  public CustomerDetail(String cpr) {
    super(cpr);
    }
    
  public String getTitle() {
    return title;
    }

  public void setTitle(String title) {
    this.title = title;
    }

  public String getFirstName() {
    return firstName;
    }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

  public String getLastName() {
    return lastName;
    }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    }

  public String getStreet() {
    return street;
    }

  public void setStreet(String street) {
    this.street = street;
    }

  public String getPostalCode() {
    return postalCode;
    }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
    }

  public String getPostalDistrict() {
    return postalDistrict;
    }

  public void setPostalDistrict(String postalDistrict) {
    this.postalDistrict = postalDistrict;
    }

  public String getPhone() {
    return phone;
    }

  public void setPhone(String phone) {
    this.phone = phone;
    }

  public String getEmail() {
    return email;
    }

  public void setEmail(String email) {
    this.email = email;
    }


  
  
  }
