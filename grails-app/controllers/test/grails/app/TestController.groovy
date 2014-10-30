package test.grails.app

class TestController {

    def index() { 
	render 'bob'
	}

    def pdf1() {
	def xml = [a:'AA', b:1]
	 	
	renderPdf(
		template: "pdf-report", 
		model: [xml: xml], 
		filename: 'output')
	}

    def pdf2() {
	def xmlString = '<?xml version="1.0" encoding="UTF-8"?><MMP><TAG1>has some text</TAG1><MERCHANT><RESPONSE><url>http://XXXXXXx/asdasd/asdsd/as</url><param name="ttype">QEQW</param><param name="tempTxnId">155411</param><param name="token">v22mMSXr2aS01JPi2ZXDqT0%3D</param><param name="txnStage">1</param></RESPONSE></MERCHANT><TAG2>more text</TAG2></MMP>'
	def xml = new XmlSlurper().parseText(xmlString)
	 	
	renderPdf(
		template: "pdf-report-2", 
		model: [xml: xml], 
		filename: 'output')
	}

}
