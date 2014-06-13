
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<html ng-app>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>"""),_display_(Seq[Any](/*12.17*/title)),format.raw/*12.22*/("""</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*16.39*/routes/*16.45*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*16.88*/("""">
        <style>
            body """),format.raw/*18.18*/("""{"""),format.raw/*18.19*/("""
                padding-top: 60px;
                padding-bottom: 40px;
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""
        </style>
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*23.39*/routes/*23.45*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*23.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*24.54*/routes/*24.60*/.Assets.at("stylesheets/main.css"))),format.raw/*24.94*/("""">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*26.59*/routes/*26.65*/.Assets.at("images/favicon.png"))),format.raw/*26.97*/("""">
        
        <script src=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*28.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Assets.at("javascripts/vendor/modernizr-2.6.2.min.js"))),format.raw/*29.84*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Assets.at("javascripts/vendor/angular.min.js"))),format.raw/*30.76*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.Assets.at("javascripts/app.js"))),format.raw/*31.61*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*32.23*/routes/*32.29*/.Assets.at("javascripts/controller.js"))),format.raw/*32.68*/(""""></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->
        
        """),_display_(Seq[Any](/*39.10*/content)),format.raw/*39.17*/("""        
        
        <!-- 
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src=""""),_display_(Seq[Any](/*43.64*/routes/*43.70*/.Assets.at("javascripts/vendor/jquery-1.9.1.min.js"))),format.raw/*43.122*/(""""><\/script>')</script>
        -->
 
        <script src=""""),_display_(Seq[Any](/*46.23*/routes/*46.29*/.Assets.at("javascripts/vendor/bootstrap.min.js"))),format.raw/*46.78*/(""""></script>

        <script src=""""),_display_(Seq[Any](/*48.23*/routes/*48.29*/.Assets.at("javascripts/plugins.js"))),format.raw/*48.65*/(""""></script>

    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 24 14:58:56 PDT 2013
                    SOURCE: /home/jcheng/Documents/workspace/bizplay/app/views/main.scala.html
                    HASH: 3a4614e13a22a705171c23072c8c56bf9fe54067
                    MATRIX: 509->1|616->31|1087->466|1114->471|1311->632|1326->638|1391->681|1455->717|1484->718|1598->804|1627->805|1719->861|1734->867|1810->921|1902->977|1917->983|1973->1017|2079->1087|2094->1093|2148->1125|2218->1159|2233->1165|2300->1210|2393->1267|2408->1273|2485->1328|2555->1362|2570->1368|2639->1415|2709->1449|2724->1455|2778->1487|2848->1521|2863->1527|2924->1566|3340->1946|3369->1953|3591->2139|3606->2145|3681->2197|3777->2257|3792->2263|3863->2312|3934->2347|3949->2353|4007->2389
                    LINES: 19->1|22->1|33->12|33->12|37->16|37->16|37->16|39->18|39->18|42->21|42->21|44->23|44->23|44->23|45->24|45->24|45->24|47->26|47->26|47->26|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|60->39|60->39|64->43|64->43|64->43|67->46|67->46|67->46|69->48|69->48|69->48
                    -- GENERATED --
                */
            