import groovy.xml.MarkupBuilder
/**
 * User: nikosgalifianakis Date: 18/10/2014 Time: 12:30
 */
abstract class Order {


    private static final String XML_DECLARATION = '<?xml version="1.0" encoding="UTF-8"?>'
    private static final String DOCTYPE = '<!DOCTYPE paymentService PUBLIC "-//WorldPay/DTD WorldPay PaymentService v1//EN" "http://dtd.worldpay.com/paymentService_v1.dtd">'

    def paymentDetails

    def renderXML() {
        def writer = new StringWriter()
        writer << XML_DECLARATION
        writer << DOCTYPE

        def builder = new MarkupBuilder(writer)
        builder.paymentService(version: '1.4') {
            submit {

                outputMethod(builder)
            }
        }
        writer.toString()
    }

    abstract def outputMethod(builder)
}
