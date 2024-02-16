let clear_data = () =>{
    document.getElementById("new").addEventListener
    (document.location.reload())
}

let results = () => {
    try{
    let data = {
        speed : document.getElementById("speed").value,
        time : document.getElementById("time").value,
        distance : document.getElementById("distance").value,
        answer: document.getElementById("answer")
    };
    
    if(data.speed === ''){
        document.getElementById("answer").addEventListener
        (speed.value = (distance.value)/(time.value)+("m/s"),(time.value += ("s")),(distance.value += ("m")))
    }else if(data.distance === ''){
        document.getElementById("answer").addEventListener
        (distance.value = (speed.value)*(time.value)+("m"),(speed.value += ("m/s")),(time.value +=  ("s")))

    }else{
        document.getElementById("answer").addEventListener
        (time.value = (speed.value)*(distance.value)+("s"),(distance.value += ("m")),(speed.value += ("m/s")))  
        
    };
    }catch(error){
        console.log(error);
    }
};

let kmh = () => {
    let data = {
        speed : document.getElementById("speed").value,
        time : document.getElementById("time").value,
        distance : document.getElementById("distance").value,
    };

    distance.value = parseInt(distance.value) / 1000;
    time.value = parseInt(time.value) / 3600

   document.getElementById("kmh").addEventListener
   (speed.value = time.value / distance.value + ("km/h"),(distance.value += ("km")),(time.value += ("h")))

}
