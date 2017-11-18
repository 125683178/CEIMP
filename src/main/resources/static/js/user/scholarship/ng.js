$(function () {  
       $("#input-form").keyup(function(){
         $("#input-form").popover('hide');
         var length = 30;
         var content_len = $("#input-form").val().length;
         var out_len=content_len-length;   
         if(content_len >30){
            $("#input-form-message").html('您已超出'+out_len+'字');
            $("#input-form-message").css({"color":"red"});
            // 可以继续执行其他操作
         }else{
            $("#input-form-message").html("");
            $("#submit").attr("disabled",false);
            return false;
         }       
    });

    $("#home-address").keyup(function(){
          $("#home-address").popover('hide');
         var length = 54;
         var content_len = $("#home-address").val().length;
         var out_len=content_len-length;   
         if(content_len >54){
            $("#home-address-message").html('您已超出'+out_len+'字');
            $("#home-address-message").css({"color":"red"});
         }else{
            $("#home-address-message").html("");
            $("#submit").attr("disabled",false);
            return false;
         }       
    });

     $("#month-input").keyup(function(){
         $("#month-input").popover('hide');
        var r = /^\+?[1-9][0-9]*$/;　　//正整数
        var number= $("#month-input").val();
        if(r.test(number)){
            $("#month-input-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#month-input-message").html("请输入整数");
        }
    });
     $("#family-number").keyup(function(){
         $("#family-number").popover('hide');
        var r = /^\+?[1-9][0-9]*$/;　　//正整数
        var number= $("#family-number").val();
        if(r.test(number)){
            $("#family-number-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#family-number-message").html("请输入整数"); 
        }
    });
         $("#email").keyup(function(){
             $("#email").popover('hide');
        var number= $("#email").val().length;
        if(number!=6){
            $("#email-message").html("请输入6位邮政编码");        
        }
        else{
            $("#email-message").html("");
            $("#submit").attr("disabled",false);
        }
    });

            $("#farm").change(function(){
                 $("#farm").popover('hide');
                 $("#type").html("");
                 $("#submit").attr("disabled",false);          
            });
            $("#city").change(function(){
                 $("#farm").popover('hide');
                 $("#type").html(""); 
                 $("#submit").attr("disabled",false);         
            });
            $("#special").change(function(){
                 $("#common").popover('hide');
                 $("#type2").html("");
                 $("#submit").attr("disabled",false);          
            });
            $("#common").change(function(){
                 $("#common").popover('hide');
                 $("#type2").html(""); 
                 $("#submit").attr("disabled",false);         
            });

        $("#submit").mouseover(function(){
          if(($("#input-form-message").html()!="" )||($("#home-address-message").html()!="" )||
            ($("#month-input-message").html()!="" )||($("#message2").html()!="" )||
            ($("#email-message").html()!="" )||($("#family-number-message").html()!="" )){    
            $("#submit").attr("disabled",true);
         }
     });

    $("#n1").keyup(function(){
        $("#p1").popover('hide');
          var r=/^[\u4e00-\u9fa5]*$/;//汉字
         var number=$("#n1").val();
         var content_len = $("#n1").val().length;
          if(r.test(number)){
            if(content_len >6){
            $("#n1-message").html('最多输入6个字符');
         }else{
             $("#n1-message").html("");
              $("#submit").attr("disabled",false);
            return false;
         }  
        }
        else{
            $("#n1-message").html("只能输入汉字");
        }  
    });
     $("#a1").keyup(function(){
         $("#p1").popover('hide');
        var r = /^(0|([1-9]\d?)|(1[01]\d)|(120))(\.\d*)?$/;　
        var number= $("#a1").val();
        if (number=="") {
             $("#a1-message").html("");
        }
        else if(r.test(number)){
            $("#a1-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#a1-message").html("输入0-120整数");
        }

    });
     $("#p1").keyup(function(){  
      $("#p1").popover('hide');    
        var number= $("#p1").val().length;
        if(number>11){
            $("#p1-message").html("最多输入10个字符");         
        }
        else{
            $("#p1-message").html("");
            $("#submit").attr("disabled",false);
        }
    });

    $("#n2").keyup(function(){
         $("#p2").popover('hide');
          var r=/^[\u4e00-\u9fa5]*$/;//汉字
         var number=$("#n2").val();
         var content_len = $("#n2").val().length;
          if(r.test(number)){
            if(content_len >6){
            $("#n2-message").html('最多输入6个字符');  
         }else{
             $("#n2-message").html("");
              $("#submit").attr("disabled",false);
            return false;
         }  
        }
        else{
            $("#n3-message").html("只能输入汉字");
        }  
    });
         $("#a2").keyup(function(){
             $("#p2").popover('hide');
        var r = /^(0|([1-9]\d?)|(1[01]\d)|(120))(\.\d*)?$/;　
        var number= $("#a2").val();
        if (number=="") {
             $("#a2-message").html("");
        }
        else if(r.test(number)){
            $("#a2-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#a2-message").html("输入0-120整数");
        }
    });
              $("#p2").keyup(function(){  
               $("#p2").popover('hide');    
        var number= $("#p2").val().length;
        if(number>11){
            $("#p2-message").html("最多输入10个字符");         
        }
        else{
            $("#p2-message").html("");
            $("#submit").attr("disabled",false);
        }
    });

    $("#n3").keyup(function(){
         $("#p3").popover('hide');
          var r=/^[\u4e00-\u9fa5]*$/;//汉字
         var number=$("#n3").val();
         var content_len = $("#n3").val().length;
          if(r.test(number)){
            if(content_len >6){
            $("#n3-message").html('最多输入6个字符');   
         }else{
             $("#n3-message").html("");
              $("#submit").attr("disabled",false);
            return false;
         }  
        }
        else{
            $("#n3-message").html("只能输入汉字");
        }  
    });
         $("#a3").keyup(function(){
             $("#p3").popover('hide');
        var r = /^(0|([1-9]\d?)|(1[01]\d)|(120))(\.\d*)?$/;　
        var number= $("#a3").val();
        if (number=="") {
             $("#a3-message").html("");
        }
        else if(r.test(number)){
            $("#a3-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#a3-message").html("输入0-120整数");
        }
    });
              $("#p3").keyup(function(){ 
               $("#p3").popover('hide');     
        var number= $("#p3").val().length;
        if(number>11){
            $("#p3-message").html("最多输入10个字符");         
        }
        else{
            $("#p3-message").html("");
            $("#submit").attr("disabled",false);
        }
    });

    $("#n4").keyup(function(){
         $("#p4").popover('hide');
          var r=/^[\u4e00-\u9fa5]*$/;//汉字
         var number=$("#n4").val();
         var content_len = $("#n4").val().length;
          if(r.test(number)){
            if(content_len >6){
            $("#n4-message").html('最多输入6个字符');  
         }else{
             $("#n4-message").html("");
              $("#submit").attr("disabled",false);
            return false;
         }  
        }
        else{
            $("#n4-message").html("只能输入汉字");
        }  
    });
         $("#a4").keyup(function(){
            $("#p4").popover('hide');
        var r = /^(0|([1-9]\d?)|(1[01]\d)|(120))(\.\d*)?$/;　
        var number= $("#a4").val();
        if (number=="") {
             $("#a3-message").html("");
        }
        else if(r.test(number)){
            $("#a4-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#a4-message").html("输入0-120整数");
        }
    });
              $("#p4").keyup(function(){  
              $("#p4").popover('hide');    
        var number= $("#p4").val().length;
        if(number>11){
            $("#p4-message").html("最多输入10个字符");         
        }
        else{
            $("#p4-message").html("");
            $("#submit").attr("disabled",false);
        }
    });
   $("#submit").mouseover(function(){
          if(($("#input-form-message").html()!="" )||($("#home-address-message").html()!="" )||
            ($("#month-input-message").html()!="" )||($("#message2").html()!="" )||($("#email-message").html()!="" )
            ||($("#family-number-message").html()!="" )||($("#n1-message").html()!="")||($("#n2-message").html()!="")
            ||($("#n3-message").html()!="")||($("#n4-message").html()!="")||($("#a1-message").html()!="")
            ||($("#a2-message").html()!="")||($("#a3-message").html()!="")||($("#a4-message").html()!="")
            ||($("#p1-message").html()!="")||($("#p2-message").html()!="")||($("#p3-message").html()!="")
            ||($("#p4-message").html()!="")
            ){    
            $("#submit").attr("disabled",true);
         }
     });


     $("#submit").click(function(){
         if( (($("#n1").val()=="")&&($("#p1").val()=="")&&($("#a1").val()=="")&&($("#r1").val()==""))||
            (($("#n1").val()!="")&&($("#p1").val()!="")&&($("#a1").val()!="")&&($("#r1").val()!=""))
            ){
            if( (($("#n2").val()=="")&&($("#p2").val()=="")&&($("#a2").val()=="")&&($("#r2").val()==""))||
            (($("#n2").val()!="")&&($("#p2").val()!="")&&($("#a2").val()!="")&&($("#r2").val()!=""))
            ){
              if( (($("#n3").val()=="")&&($("#p3").val()=="")&&($("#a3").val()=="")&&($("#r3").val()==""))||
            (($("#n3").val()!="")&&($("#p3").val()!="")&&($("#a3").val()!="")&&($("#r3").val()!=""))
            ){
                 if( (($("#n4").val()=="")&&($("#p4").val()=="")&&($("#a4").val()=="")&&($("#r4").val()==""))||
            (($("#n4").val()!="")&&($("#p4").val()!="")&&($("#a4").val()!="")&&($("#r4").val()!=""))
            ){
          if($("#month-input").val()==""){
             $("#month-input").popover({
                content:"请输入家庭月收入",
            });
               $("#month-input").popover('show');
              var position=$("#month-input").offset().top-200;
              $("html,body").animate({
                 "scrollTop":position},"slow");  
                  return false;  
         }    
         var type=$('input:radio[name="type"]:checked').val();
            if(type==null){
                   $("#farm").popover({
                content:"请选择",
            });
               $("#farm").popover('show');
                  var position=$("#type").offset().top-200;
                  $("html,body").animate({
                 "scrollTop":position},"slow");  
                 return false;  
            } 

         if($("#input-form").val()==""){
            var position=$("#input-form").offset().top-200;
            $("#input-form").popover({
                content:"请输入收入来源",
            });
               $("#input-form").popover('show');
              $("html,body").animate({
                 "scrollTop":position},"slow");
                  return false;    
         } 

        if ($("#family-number").val()=="") {
            var position=$("#family-number").offset().top-200;
             $("#family-number").popover({
                content:"请输入家庭人口数",
            });
               $("#family-number").popover('show');
            $("html,body").animate({
                 "scrollTop":position},"slow");
            return false;
         }

         if ($("#email").val()=="") {
             var position=$("#email").offset().top-200;
             $("#email").popover({
                content:"请输入邮政编码",
            });
               $("#email").popover('show');
            $("html,body").animate({
                 "scrollTop":position},"slow");
            return false;
         }
         if ($("#home-address").val()=="") {
             var position=$("#home-address").offset().top-200;
           $("#home-address").popover({
                content:"请输入家庭住址",
            });
               $("#home-address").popover('show');
            $("html,body").animate({
                 "scrollTop":position},"slow");  
                 return false; 
            return false;
         }
         var type=$('input:radio[name="type2"]:checked').val();
            if(type==null){
                  $("#common").popover({
                content:"请选择",
            });
               $("#common").popover('show');
                   var position=$("#type2").offset().top-200;
                  $("html,body").animate({
                 "scrollTop":position},"slow");  
                 return false;  
            } 
             if ($("#text1").val()=="") {
                 var position=$("#text1").offset().top-200;
            $("#text1").popover({
                content:"请输入申请理由",
            });
               $("#text1").popover('show');
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
            return false;
         }    
                 }
             else{
                  $("#p4").popover({
                content:"请将信息填写完整",
            });
               $("#p4").popover('show');
                  
                   var position=$("#p4-message").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
             }

     }
         else{
               $("#p3").popover({
                content:"请将信息填写完整",
            });
               $("#p3").popover('show');
               var position=$("#p3-message").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }
     }
      else{
               $("#p2").popover({
                content:"请将信息填写完整",
            });
               $("#p2").popover('show');
               var position=$("#p2-message").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }

     }
         else{
               $("#p1").popover({
                content:"请将信息填写完整",
            });
               $("#p1").popover('show');
               var position=$("#p1-message").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }

     });

}); 