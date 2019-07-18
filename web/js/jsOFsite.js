window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("btt").style.display = "block";
    } else {
        document.getElementById("btt").style.display = "none";
    }
}
function upto(){
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}