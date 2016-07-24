
//Twitter-Button
     !function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');

     //Facebook-Button
     (function(d, s, id) {
          var js, fjs = d.getElementsByTagName(s)[0];
          if (d.getElementById(id)) return;
          js = d.createElement(s); js.id = id;
          js.src = "//connect.facebook.net/de_DE/sdk.js#xfbml=1&version=v2.6";
          fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));



$(document).ready(function(){
	//Smooth Scrolling
	   var $root = $('html, body');
          $('.navbar-nav a').click(function() {
              var href = $.attr(this, 'href');
              $root.animate({
                  scrollTop: $(href).offset().top
              }, 500, function () {
                  window.location.hash = href;
              });
              return false;
          });

          //Stellar
          $.stellar();

          //Tooltips
         $(function () {
         $("#item1").tooltip();
       });

        $(function () {
          $('[data-toggle="tooltip"]').tooltip();
      });

        //Button

        $("#button").on("click", function() {
 		var comment = $("#textbox").val();
        	console.log(comment);       	
        	$("#labeltextbox").html("This is your comment: " + comment);
        	$("#textbox").hide();
        	return false;
        });

});
