
/**
 * User: nikosgalifianakis Date: 18/10/2014 Time: 14:12
 */
class SofortOrder extends Order{

    def outputMethod(builder) {
        builder.'successURL' 'successURL'
        builder.'pendingURL' 'pendingURL'
        builder.'cancelURL' 'cancelURL'
    }
}
