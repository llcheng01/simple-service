
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Mappings")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""
<div  ng-controller="MappingListCtrl">
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#">Eligibility Mappings</a>
            <div class="nav-collapse collapse">
                <!--
                <p class="navbar-text pull-right">
                    Logged in as <a href="#" class="navbar-link">Username</a>
                </p>
                -->
                <ul class="nav">
                    <li class="active"><a href="/">Home</a></li>
                    <li><a href="/metrics">Metrics</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span3">
            <!--Sidebar content-->
            <div class="input-append">
                <span class="add-on">Search:</span>
                <input ng-model="query">
            </div>
            <div class="input-append">
                <span class="add-on">Sort by:</span>
                <select ng-model="orderProp">
                    <option value="eligibleApiPayerName">Alphabetical</option>
                    <option value="clearinghousePayerID">Newest</option>
                </select>
            </div>
        </div>
        <div class="span9">
            <!--Body content-->
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Eapi ID</th>
                        <th>Name</th>
                        <th>Payer ID</th>
                        <th>Payer Name</th>
                        <th>Active?</th>
                    </tr>
                </thead>
                <tbody>
                    <tr  ng-repeat="mapping in mappings | filter:query | orderBy:orderProp">
                        <td>"""),format.raw/*57.29*/("""{"""),format.raw/*57.30*/("""{"""),format.raw/*57.31*/("""mapping.clearinghousePayerID"""),format.raw/*57.59*/("""}"""),format.raw/*57.60*/("""}"""),format.raw/*57.61*/("""</td>
                        <td>"""),format.raw/*58.29*/("""{"""),format.raw/*58.30*/("""{"""),format.raw/*58.31*/("""mapping.eligibleApiPayerNumber"""),format.raw/*58.61*/("""}"""),format.raw/*58.62*/("""}"""),format.raw/*58.63*/("""</td>
                        <td>"""),format.raw/*59.29*/("""{"""),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""mapping.eligibleApiPayerName"""),format.raw/*59.59*/("""}"""),format.raw/*59.60*/("""}"""),format.raw/*59.61*/("""</td>
                        <td>"""),format.raw/*60.29*/("""{"""),format.raw/*60.30*/("""{"""),format.raw/*60.31*/("""mapping.payerNumber"""),format.raw/*60.50*/("""}"""),format.raw/*60.51*/("""}"""),format.raw/*60.52*/("""</td>
                        <td>"""),format.raw/*61.29*/("""{"""),format.raw/*61.30*/("""{"""),format.raw/*61.31*/("""mapping.payerName"""),format.raw/*61.48*/("""}"""),format.raw/*61.49*/("""}"""),format.raw/*61.50*/("""</td>
                        <td>
                            <input type="checkbox" name="active"
                                   ng-checked=""""),format.raw/*64.48*/("""{"""),format.raw/*64.49*/("""{"""),format.raw/*64.50*/("""mapping.active"""),format.raw/*64.64*/("""}"""),format.raw/*64.65*/("""}"""),format.raw/*64.66*/(""""
                                  />
                        </td>
                    </tr>
                </tbody>
            </table>

        </div>
    </div>
    <hr/>
    <footer>
        <p>© Kareo 2013</p>
    </footer>
</div>
</div>
""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 24 14:58:56 PDT 2013
                    SOURCE: /home/jcheng/Documents/workspace/bizplay/app/views/index.scala.html
                    HASH: cc52aebbec8ecb46004066996b3b49aaa4d489e0
                    MATRIX: 578->1|602->17|641->19|2876->2226|2905->2227|2934->2228|2990->2256|3019->2257|3048->2258|3110->2292|3139->2293|3168->2294|3226->2324|3255->2325|3284->2326|3346->2360|3375->2361|3404->2362|3460->2390|3489->2391|3518->2392|3580->2426|3609->2427|3638->2428|3685->2447|3714->2448|3743->2449|3805->2483|3834->2484|3863->2485|3908->2502|3937->2503|3966->2504|4141->2651|4170->2652|4199->2653|4241->2667|4270->2668|4299->2669|4578->2917
                    LINES: 22->1|22->1|22->1|78->57|78->57|78->57|78->57|78->57|78->57|79->58|79->58|79->58|79->58|79->58|79->58|80->59|80->59|80->59|80->59|80->59|80->59|81->60|81->60|81->60|81->60|81->60|81->60|82->61|82->61|82->61|82->61|82->61|82->61|85->64|85->64|85->64|85->64|85->64|85->64|100->79
                    -- GENERATED --
                */
            