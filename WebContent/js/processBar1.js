var left1 = 270;
var left2 = 270;
var left3 = 270;
var left4 = 270;
var left5 = 270;
var left6 = 270;
$(function(){
	debugger;
                var tag1 = false,ox1 = 0,bgleft1 = 270;
                
                var tag2 = false,ox2 = 0,bgleft2 = 270;
                
                var tag3 = false,ox3 = 0,bgleft3 = 270;
                
                var tag4 = false,ox4 = 0,bgleft4 = 270;
                
                var tag5 = false,ox5 = 0,bgleft5 = 270;
                
                var tag6 = false,ox6 = 0,bgleft6 = 270;
                
                
               
                $('.progress_btn1').mousedown(function(e) {
                    ox1 = e.pageX - left1;
                    tag1 = true;
                });
               
                
                $('.progress_btn2').mousedown(function(e) {
                    ox2 = e.pageX - left2;
                    tag2 = true;
                });
               
                
                $('.progress_btn3').mousedown(function(e) {
                    ox3 = e.pageX - left3;
                    tag3 = true;
                });
                
                $('.progress_btn4').mousedown(function(e) {
                    ox4 = e.pageX - left4;
                    tag4 = true;
                });
               
                
                $('.progress_btn5').mousedown(function(e) {
                    ox5 = e.pageX - left5;
                    tag5 = true;
                });
               
                
                $('.progress_btn6').mousedown(function(e) {
                    ox6 = e.pageX - left6;
                    tag6 = true;
                });
                
                
                $(document).mouseup(function() {
                    tag1 = false;
                    
                    tag2 = false;
                    
                    tag3 = false;
                    
                    tag4 = false;
                    
                    tag5 = false;
                    
                    tag6 = false;
                });
                $('.progress11').mousemove(function(e) {//鼠标移动
                    if (tag1) {
                        left1 = e.pageX - ox1;
                        if (left1 <= 0) {
                            left1 = 5;
                        }else if (left1 > 540) {
                            left1 = 540;
                        }
                        $('.progress_btn1').css('left', left1);
                        $('.progress_bar1').width(left1);
                        
                    }
                    
                    if (tag2) {
                        left2 = e.pageX - ox2;
                        if (left2 <= 0) {
                            left2 = 5;
                        }else if (left2 > 540) {
                            left2 = 540;
                        }
                        $('.progress_btn2').css('left', left2);
                        $('.progress_bar2').width(left2);
                        
                    }
                    
                   
                    
                    if (tag3) {
                        left3 = e.pageX - ox3;
                        if (left3 <= 0) {
                            left3 = 5;
                        }else if (left3 > 540) {
                            left3 = 540;
                        }
                        $('.progress_btn3').css('left', left3);
                        $('.progress_bar3').width(left3);
                    }
                    
                    
                    if (tag4) {
                        left4 = e.pageX - ox4;
                        if (left4 <= 0) {
                            left4 = 5;
                        }else if (left4 > 540) {
                            left4 = 540;
                        }
                        $('.progress_btn4').css('left', left4);
                        $('.progress_bar4').width(left4);
                    }
                    
                    
                    if (tag5) {
                        left5 = e.pageX - ox5;
                        if (left5 <= 0) {
                            left5 = 5;
                        }else if (left5 > 540) {
                            left5 = 540;
                        }
                        $('.progress_btn5').css('left', left5);
                        $('.progress_bar5').width(left5);
                    }
                    
                    if (tag6) {
                        left6 = e.pageX - ox6;
                        if (left6 <= 0) {
                            left6 = 5;
                        }else if (left6 > 540) {
                            left6 = 540;
                        }
                        $('.progress_btn6').css('left', left6);
                        $('.progress_bar6').width(left6);
                    }
                    
                });
                
               
                
               $('.progress_bg1').click(function(e) {//鼠标点击
            	    
                    if (!tag1) {
                        bgleft1 = $('.progress_bg1').offset().left;
                        left1 = e.pageX - bgleft1;
                        if (left1 <= 0) {
                            left1 = 5;
                        }else if (left1 > 540) {
                            left1 = 540;
                        }
                        $('.progress_btn1').css('left', left1);
                        $('.progress_bar1').animate({width:left1},540);
                        
                    }
                    
                });
               
               
               $('.progress_bg2').click(function(e) {//鼠标点击

                   if (!tag2) {
                       bgleft2 = $('.progress_bg2').offset().left;
                       left2 = e.pageX - bgleft2;
                       if (left2 <= 0) {
                           left2 = 5;
                       }else if (left2 > 540) {
                           left2 = 540;
                       }
                       $('.progress_btn2').css('left', left2);
                       $('.progress_bar2').animate({width:left2},540);
                   }
                   
               });
              
             
              
              $('.progress_bg3').click(function(e) {//鼠标点击
          	    
                  if (!tag3) {
                      bgleft3 = $('.progress_bg3').offset().left;
                      left3 = e.pageX - bgleft3;
                      if (left3 <= 0) {
                          left3 = 5;
                      }else if (left3 > 540) {
                          left3 = 540;
                      }
                      $('.progress_btn3').css('left', left3);
                      $('.progress_bar3').animate({width:left3},540);
                     
                  }
                  
              });
             
            
             $('.progress_bg4').click(function(e) {//鼠标点击
         	   
                 if (!tag4) {
                     bgleft4 = $('.progress_bg4').offset().left;
                     left4 = e.pageX - bgleft4;
                     if (left4 <= 0) {
                         left4 = 5;
                     }else if (left4 > 540) {
                         left4 = 540;
                     }
                     $('.progress_btn4').css('left', left4);
                     $('.progress_bar4').animate({width:left4},540);
                     //$('.text11').html(parseInt((left11/540)*100) + '%');
                 }
                 
             });
            
            
            $('.progress_bg5').click(function(e) {//鼠标点击
        	    
                if (!tag5) {
                    bgleft5 = $('.progress_bg5').offset().left;
                    left5 = e.pageX - bgleft5;
                    if (left5 <= 0) {
                        left5 = 5;
                    }else if (left5 > 540) {
                        left5 = 540;
                    }
                    $('.progress_btn5').css('left', left5);
                    $('.progress_bar5').animate({width:left5},540);
                   
                }
                
            });
           
           
           
           $('.progress_bg6').click(function(e) {//鼠标点击
       	   
               if (!tag6) {
                   bgleft6 = $('.progress_bg6').offset().left;
                   left6 = e.pageX - bgleft6;
                   if (left6 <= 0) {
                       left6 = 5;
                   }else if (left6 > 540) {
                       left6 = 540;
                   }
                   $('.progress_btn6').css('left', left6);
                   $('.progress_bar6').animate({width:left6},540);
                   
               }
               
           });
          
               
            });