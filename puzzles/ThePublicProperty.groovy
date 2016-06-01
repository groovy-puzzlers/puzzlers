trait Public {
   public String property = "I am all public!"

}

class Property implements Public {}

Property publicProperty = new Property()
//println publicProperty.@property
//println publicProperty.property
//println publicProperty.getProperty()

println publicProperty.Public__property