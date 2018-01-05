var left11 = 300,left12 = 0;
var left21 = 300,left22 = 0;
var left31 = 300,left32 = 0;
var left41 = 300,left42 = 0;
var left51 = 300,left52 = 0;
var left61 = 300,left62 = 0;
$(function(){
	debugger;
                var tag11 = false,ox11 = 0,bgleft11 = 0;
                var tag12 = false,ox12 = 0,bgleft12 = 0;
                
                var tag21 = false,ox21 = 0,bgleft21 = 0;
                var tag22 = false,ox22 = 0,bgleft22 = 0;
                
                var tag31 = false,ox31 = 0,bgleft31 = 0;
                var tag32 = false,ox32 = 0,bgleft32 = 0;
                
                var tag41 = false,ox41 = 0,bgleft41 = 0;
                var tag42 = false,ox42 = 0,bgleft42 = 0;
                
                var tag51 = false,ox51 = 0,bgleft51 = 0;
                var tag52 = false,ox52 = 0,bgleft52 = 0;
                
                var tag61 = false,ox61 = 0,bgleft61 = 0;
                var tag62 = false,ox62 = 0,bgleft62 = 0;
                
                
               
                $('.progress_btn11').mousedown(function(e) {
                    ox11 = e.pageX - left11;
                    tag11 = true;
                });
                $('.progress_btn12').mousedown(function(e) {
                    ox12 = e.pageX - left12;
                    tag12 = true;
                });
                
                $('.progress_btn21').mousedown(function(e) {
                    ox21 = e.pageX - left21;
                    tag21 = true;
                });
                $('.progress_btn22').mousedown(function(e) {
                    ox22 = e.pageX - left22;
                    tag22 = true;
                });
                
                $('.progress_btn31').mousedown(function(e) {
                    ox31 = e.pageX - left31;
                    tag31 = true;
                });
                $('.progress_btn32').mousedown(function(e) {
                    ox32 = e.pageX - left32;
                    tag32 = true;
                });
                
                $('.progress_btn41').mousedown(function(e) {
                    ox41 = e.pageX - left41;
                    tag41 = true;
                });
                $('.progress_btn42').mousedown(function(e) {
                    ox42 = e.pageX - left42;
                    tag42 = true;
                });
                
                $('.progress_btn51').mousedown(function(e) {
                    ox51 = e.pageX - left51;
                    tag51 = true;
                });
                $('.progress_btn52').mousedown(function(e) {
                    ox52 = e.pageX - left52;
                    tag52 = true;
                });
                
                $('.progress_btn61').mousedown(function(e) {
                    ox61 = e.pageX - left61;
                    tag61 = true;
                });
                $('.progress_btn62').mousedown(function(e) {
                    ox62 = e.pageX - left62;
                    tag62 = true;
                });
                
                
                $(document).mouseup(function() {
                    tag11 = false;
                    tag12 = false;
                    
                    tag21 = false;
                    tag22 = false;
                    
                    tag31 = false;
                    tag32 = false;
                    
                    tag41 = false;
                    tag42 = false;
                    
                    tag51 = false;
                    tag52 = false;
                    
                    tag51 = false;
                    tag52 = false;
                    
                    tag61 = false;
                    tag62 = false;
                });
                $('.progress').mousemove(function(e) {//鼠标移动
                    if (tag11) {
                        left11 = e.pageX - ox11;
                        if (left11 <= 0) {
                            left11 = 5;
                        }else if (left11 > 300) {
                            left11 = 300;
                        }
                        $('.progress_btn11').css('left', left11);
                        $('.progress_bar11').width(left11);
                        $('.text11').html(parseInt((left11/300)*100) + '%');
                    }
                    
                    if (tag12) {
                        left12 = e.pageX - ox12;
                        if (left12 <= 0) {
                            left12 = 5;
                        }else if (left12 > 294) {
                            left12 = 290;
                        }
                        $('.progress_btn12').css('left', left12);
                        $('.progress_bar12').width(left12+5);
                        $('.text12').html(parseInt((left12/300)*100) + '%');
                    }
                    
                    if (tag21) {
                        left21 = e.pageX - ox21;
                        if (left21 <= 0) {
                            left21 = 5;
                        }else if (left21 > 300) {
                            left21 = 300;
                        }
                        $('.progress_btn21').css('left', left21+4);
                        $('.progress_bar21').width(left21);
                        $('.text21').html(parseInt((left21/300)*100) + '%');
                    }
                    
                    if (tag22) {
                        left22 = e.pageX - ox22;
                        if (left22 <= 0) {
                            left22 = 5;
                        }else if (left22 > 294) {
                            left22 = 290;
                        }
                        $('.progress_btn22').css('left', left22);
                        $('.progress_bar22').width(left22+5);
                        $('.text22').html(parseInt((left22/300)*100) + '%');
                    }
                    
                    if (tag31) {
                        left31 = e.pageX - ox31;
                        if (left31 <= 0) {
                            left31 = 5;
                        }else if (left31 > 300) {
                            left31 = 300;
                        }
                        $('.progress_btn31').css('left', left31);
                        $('.progress_bar31').width(left31);
                    }
                    
                    if (tag32) {
                        left32 = e.pageX - ox32;
                        if (left32 <= 0) {
                            left32 = 5;
                        }else if (left32 > 294) {
                            left32 = 290;
                        }
                        $('.progress_btn32').css('left', left32);
                        $('.progress_bar32').width(left32+5);
                    }
                    
                    if (tag41) {
                        left41 = e.pageX - ox41;
                        if (left41 <= 0) {
                            left41 = 5;
                        }else if (left41 > 300) {
                            left41 = 300;
                        }
                        $('.progress_btn41').css('left', left41);
                        $('.progress_bar41').width(left41);
                    }
                    
                    if (tag42) {
                        left42 = e.pageX - ox42;
                        if (left42 <= 0) {
                            left42 = 5;
                        }else if (left42 > 294) {
                            left42 = 290;
                        }
                        $('.progress_btn42').css('left', left42);
                        $('.progress_bar42').width(left42+5);
                    }
                    
                    if (tag51) {
                        left51 = e.pageX - ox51;
                        if (left51 <= 0) {
                            left51 = 5;
                        }else if (left51 > 300) {
                            left51 = 300;
                        }
                        $('.progress_btn51').css('left', left51);
                        $('.progress_bar51').width(left51);
                    }
                    
                    if (tag52) {
                        left52 = e.pageX - ox52;
                        if (left52 <= 0) {
                            left52 = 5;
                        }else if (left52 > 294) {
                            left52 = 290;
                        }
                        $('.progress_btn52').css('left', left52);
                        $('.progress_bar52').width(left52+5);
                    }
                    
                    if (tag61) {
                        left61 = e.pageX - ox61;
                        if (left61 <= 0) {
                            left61 = 5;
                        }else if (left61 > 300) {
                            left61 = 300;
                        }
                        $('.progress_btn61').css('left', left61);
                        $('.progress_bar61').width(left61);
                    }
                    
                    if (tag62) {
                        left62 = e.pageX - ox62;
                        if (left62 <= 0) {
                            left62 = 5;
                        }else if (left62 > 294) {
                            left62 = 290;
                        }
                        $('.progress_btn62').css('left', left62);
                        $('.progress_bar62').width(left62+5);
                    }
                });
                
               
                
               $('.progress_bg11').click(function(e) {//鼠标点击
            	    $(".progress_btn11").css({left:'300',display:'block'});
            	    $(".progress_btn12").css({left:'0',display:'none'});
            	  
           	        $(".progress_bar12").css({width:'0'});
           	        
           	        left12 = 0;
                    if (!tag11) {
                        bgleft11 = $('.progress_bg11').offset().left;
                        left11 = e.pageX - bgleft11;
                        if (left11 <= 0) {
                            left11 = 5;
                        }else if (left11 > 300) {
                            left11 = 300;
                        }
                        
                        $('.progress_btn11').css('left', left11);
                        $('.progress_bar11').animate({width:left11},300);
                        $('.text11').html(parseInt((left11/300)*100) + '%');
                    }
                    
                });
               
               $('.progress_bg12').click(function(e) {//鼠标点击
            	   $(".progress_bar11").css({'width':'300', 'border-top-right-radius':'0','border-bottom-right-radius':'0'});
            	   $(".progress_btn11").css({'display':'none','left':'300'});
            	   left11 = 300;
           	       $(".progress_btn12").css({'display':'block','left':'0'});
                   if (!tag12) {
                       bgleft12 = $('.progress_bg12').offset().left;
                       left12 = e.pageX - bgleft12;
                       if (left12 <= 0) {
                           left12 = 5;
                       }else if (left12 > 294) {
                           left12 = 290;
                       }
                       
                       $('.progress_btn12').css('left', left12);
                       $('.progress_bar12').animate({width:left12+6},300);
                       $('.text12').html(parseInt((left12/300)*100) + '%');
                   }
               });
               
               
               $('.progress_bg21').click(function(e) {//鼠标点击
            	   debugger;
           	    $(".progress_btn21").css({left:'300',display:'block'});
           	    $(".progress_btn22").css({left:'0',display:'none'});
           	  
          	        $(".progress_bar22").css({width:'0'});
          	        
          	        left22 = 0;
                   if (!tag21) {
                       bgleft21 = $('.progress_bg21').offset().left;
                       left21 = e.pageX - bgleft21;
                       if (left21 <= 0) {
                           left21 = 5;
                       }else if (left21 > 300) {
                           left21 = 300;
                       }
                      
                       $('.progress_btn21').css('left', left21);
                       $('.progress_bar21').animate({width:left21},300);
                       $('.text21').html(parseInt((left21/300)*100) + '%');
                   }
                   
               });
              
              $('.progress_bg22').click(function(e) {//鼠标点击
           	   $(".progress_bar21").css({'width':'300', 'border-top-right-radius':'0','border-bottom-right-radius':'0'});
           	   $(".progress_btn21").css({'display':'none','left':'300'});
           	   left21 = 300;
          	       $(".progress_btn22").css({'display':'block','left':'0'});
                  if (!tag22) {
                      bgleft22 = $('.progress_bg22').offset().left;
                      left22 = e.pageX - bgleft22;
                      if (left22 <= 0) {
                          left22 = 5;
                      }else if (left22 > 294) {
                          left22 = 290;
                      }
                      $('.progress_btn22').css('left', left22);
                      $('.progress_bar22').animate({width:left22+6},300);
                      $('.text22').html(parseInt((left22/300)*100) + '%');
                  }
              });
              
              $('.progress_bg31').click(function(e) {//鼠标点击
          	    $(".progress_btn31").css({left:'300',display:'block'});
          	    $(".progress_btn32").css({left:'0',display:'none'});
          	  
         	        $(".progress_bar32").css({width:'0'});
         	        
         	        left32 = 0;
                  if (!tag31) {
                      bgleft31 = $('.progress_bg31').offset().left;
                      left31 = e.pageX - bgleft31;
                      if (left31 <= 0) {
                          left31 = 5;
                      }else if (left31 > 300) {
                          left31 = 300;
                      }
                      $('.progress_btn31').css('left', left31);
                      $('.progress_bar31').animate({width:left31},300);
                      $('.text31').html(parseInt((left31/300)*100) + '%');
                  }
                  
              });
             
             $('.progress_bg32').click(function(e) {//鼠标点击
          	   $(".progress_bar31").css({'width':'300', 'border-top-right-radius':'0','border-bottom-right-radius':'0'});
          	   $(".progress_btn31").css({'display':'none','left':'300'});
          	   left31 = 300;
         	       $(".progress_btn32").css({'display':'block','left':'0'});
                 if (!tag32) {
                     bgleft32 = $('.progress_bg32').offset().left;
                     left32 = e.pageX - bgleft32;
                     if (left32 <= 0) {
                         left32 = 5;
                     }else if (left32 > 294) {
                         left32 = 290;
                     }
                     $('.progress_btn32').css('left', left32);
                     $('.progress_bar32').animate({width:left32+6},300);
                     $('.text32').html(parseInt((left32/300)*100) + '%');
                 }
             });
             
             $('.progress_bg41').click(function(e) {//鼠标点击
         	    $(".progress_btn41").css({left:'300',display:'block'});
         	    $(".progress_btn42").css({left:'0',display:'none'});
         	  
        	        $(".progress_bar42").css({width:'0'});
        	        
        	        left42 = 0;
                 if (!tag41) {
                     bgleft41 = $('.progress_bg41').offset().left;
                     left41 = e.pageX - bgleft41;
                     if (left41 <= 0) {
                         left41 = 5;
                     }else if (left41 > 300) {
                         left41 = 300;
                     }
                     $('.progress_btn41').css('left', left41);
                     $('.progress_bar41').animate({width:left41},300);
                     //$('.text11').html(parseInt((left11/300)*100) + '%');
                 }
                 
             });
            
            $('.progress_bg42').click(function(e) {//鼠标点击
         	   $(".progress_bar41").css({'width':'300', 'border-top-right-radius':'0','border-bottom-right-radius':'0'});
         	   $(".progress_btn41").css({'display':'none','left':'300'});
         	   left41 = 300;
        	       $(".progress_btn42").css({'display':'block','left':'0'});
                if (!tag42) {
                    bgleft42 = $('.progress_bg42').offset().left;
                    left42 = e.pageX - bgleft42;
                    if (left42 <= 0) {
                        left42 = 5;
                    }else if (left42 > 294) {
                        left42 = 290;
                    }
                    $('.progress_btn42').css('left', left42);
                    $('.progress_bar42').animate({width:left42+6},300);
                    $('.text42').html(parseInt((left42/300)*100) + '%');
                }
            });
            
            $('.progress_bg51').click(function(e) {//鼠标点击
        	    $(".progress_btn51").css({left:'300',display:'block'});
        	    $(".progress_btn52").css({left:'0',display:'none'});
        	  
       	        $(".progress_bar52").css({width:'0'});
       	        
       	        left52 = 0;
                if (!tag51) {
                    bgleft51 = $('.progress_bg51').offset().left;
                    left51 = e.pageX - bgleft51;
                    if (left51 <= 0) {
                        left51 = 5;
                    }else if (left51 > 300) {
                        left51 = 300;
                    }
                    $('.progress_btn51').css('left', left51);
                    $('.progress_bar51').animate({width:left51},300);
                    $('.text51').html(parseInt((left51/300)*100) + '%');
                }
                
            });
           
           $('.progress_bg52').click(function(e) {//鼠标点击
        	   $(".progress_bar51").css({'width':'300', 'border-top-right-radius':'0','border-bottom-right-radius':'0'});
        	   $(".progress_btn51").css({'display':'none','left':'300'});
        	   left51 = 300;
       	       $(".progress_btn52").css({'display':'block','left':'0'});
               if (!tag52) {
                   bgleft52 = $('.progress_bg52').offset().left;
                   left52 = e.pageX - bgleft52;
                   if (left52 <= 0) {
                       left52 = 5;
                   }else if (left52 > 294) {
                       left52 = 290;
                   }
                   $('.progress_btn52').css('left', left52);
                   $('.progress_bar52').animate({width:left52+6},300);
                   $('.text52').html(parseInt((left52/300)*100) + '%');
               }
           });
           
           
           $('.progress_bg61').click(function(e) {//鼠标点击
       	    $(".progress_btn61").css({left:'300',display:'block'});
       	    $(".progress_btn62").css({left:'0',display:'none'});
       	  
      	        $(".progress_bar62").css({width:'0'});
      	        
      	        left62 = 0;
               if (!tag61) {
                   bgleft61 = $('.progress_bg61').offset().left;
                   left61 = e.pageX - bgleft61;
                   if (left61 <= 0) {
                       left61 = 5;
                   }else if (left61 > 300) {
                       left61 = 300;
                   }
                   $('.progress_btn61').css('left', left61);
                   $('.progress_bar61').animate({width:left61},300);
                   $('.text61').html(parseInt((left61/300)*100) + '%');
               }
               
           });
          
          $('.progress_bg62').click(function(e) {//鼠标点击
       	   $(".progress_bar61").css({'width':'300', 'border-top-right-radius':'0','border-bottom-right-radius':'0'});
       	   $(".progress_btn61").css({'display':'none','left':'300'});
       	   left61 = 300;
      	       $(".progress_btn62").css({'display':'block','left':'0'});
              if (!tag62) {
                  bgleft62 = $('.progress_bg62').offset().left;
                  left62 = e.pageX - bgleft62;
                  if (left62 <= 0) {
                      left62 = 5;
                  }else if (left62 > 294) {
                      left62 = 290;
                  }
                  $('.progress_btn62').css('left', left62);
                  $('.progress_bar62').animate({width:left62+6},300);
                  $('.text62').html(parseInt((left62/300)*100) + '%');
              }
          });
               
            });