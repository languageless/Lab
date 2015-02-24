
/**
 * User: nikosgalifianakis Date: 18/10/2014 Time: 12:59
 */
class PaypalOrder extends Order{

    def outputMethod(builder) {
        builder.'successURL' 'successURL'
        builder.'failureURL' 'failureURL'
        builder.'cancelURL' 'cancelURL'
    }
}
