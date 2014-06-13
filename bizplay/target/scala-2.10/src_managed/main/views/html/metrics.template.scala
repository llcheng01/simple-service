
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
object metrics extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Metrics")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
<div  ng-controller="MetricsListCtrl">
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#">Eligibility Metrics</a>
            <div class="nav-collapse collapse">
                <!--
                <p class="navbar-text pull-right">
                    Logged in as <a href="#" class="navbar-link">Username</a>
                </p>
                -->
                <ul class="nav">
                    <li><a href="/">Home</a></li>
                    <li class="active"><a href="/metrics">Metrics</a></li>
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
                    <option value="Name">Alphabetical</option>
                </select>
            </div>
        </div>
        <div class="span9">
            <!--Body content-->
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Count</th>
                    <th>Cost per click</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                <tr  ng-repeat="transaction in transactions | filter:query | orderBy:orderProp">
                    <td>"""),format.raw/*54.25*/("""{"""),format.raw/*54.26*/("""{"""),format.raw/*54.27*/("""transaction.name"""),format.raw/*54.43*/("""}"""),format.raw/*54.44*/("""}"""),format.raw/*54.45*/("""</td>
                    <td>"""),format.raw/*55.25*/("""{"""),format.raw/*55.26*/("""{"""),format.raw/*55.27*/("""transaction.count"""),format.raw/*55.44*/("""}"""),format.raw/*55.45*/("""}"""),format.raw/*55.46*/("""</td>
                    <td>
                        <input type="text" name="costperclick" ng-model="transaction.costperclick" />
                    </td>
                    <td>$"""),format.raw/*59.26*/("""{"""),format.raw/*59.27*/("""{"""),format.raw/*59.28*/("""calcRowTotal(transaction) | number:2"""),format.raw/*59.64*/("""}"""),format.raw/*59.65*/("""}"""),format.raw/*59.66*/("""</td>
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
""")))})),format.raw/*72.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 24 14:58:56 PDT 2013
                    SOURCE: /home/jcheng/Documents/workspace/bizplay/app/views/metrics.scala.html
                    HASH: 67e8caf82e263f85c9eb2ea1ba6aa0d3e4429297
                    MATRIX: 580->1|603->16|642->18|2685->2033|2714->2034|2743->2035|2787->2051|2816->2052|2845->2053|2903->2083|2932->2084|2961->2085|3006->2102|3035->2103|3064->2104|3276->2288|3305->2289|3334->2290|3398->2326|3427->2327|3456->2328|3668->2509
                    LINES: 22->1|22->1|22->1|75->54|75->54|75->54|75->54|75->54|75->54|76->55|76->55|76->55|76->55|76->55|76->55|80->59|80->59|80->59|80->59|80->59|80->59|93->72
                    -- GENERATED --
                */
            