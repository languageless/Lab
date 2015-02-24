
/**
 * User: nikosgalifianakis Date: 18/10/2014 Time: 12:41
 */
class OrderTest extends GroovyTestCase {
    void testRenderXMLWithPaypal() {

        def order = new PaypalOrder(paymentDetails: new PaymentDetails(method: 'PAYPAL'))

        def xml = order.renderXML()
        def submit = new XmlSlurper().parseText(xml).submit

        assertEquals 'successURL', submit.successURL as String
        assertEquals 'failureURL', submit.failureURL as String
        assertEquals 'cancelURL', submit.cancelURL as String
    }

    void testRenderXMLWithSofort() {

        def order = new SofortOrder(paymentDetails: new PaymentDetails(method: 'SOFORT'))

        def xml = order.renderXML()
        def submit = new XmlSlurper().parseText(xml).submit

        assertEquals 'successURL', submit.successURL as String
        assertEquals 'pendingURL', submit.pendingURL as String
        assertEquals 'cancelURL', submit.cancelURL as String
    }
}
