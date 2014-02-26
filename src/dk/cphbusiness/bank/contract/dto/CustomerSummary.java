package dk.cphbusiness.bank.contract.dto;

public class CustomerSummary extends CustomerIdentifier {
  private final String name;
  private final String address;
  private final String phone;
  private final String email;
  
  
  public CustomerSummary(
      String cpr,
      String name,
      String address,
      String phone,
      String email
      ) {
    super(cpr);
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
    }

  public String getName() {
    return name;
    }

  public String getAddress() {
    return address;
    }

  public String getPhone() {
    return phone;
    }

  public String getEmail() {
    return email;
    }
  
  }
