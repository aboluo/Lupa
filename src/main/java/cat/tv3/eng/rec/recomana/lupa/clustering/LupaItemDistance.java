/**
Copyright 2014 Jaume Jané 

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package cat.tv3.eng.rec.recomana.lupa.clustering;


import cat.tv3.eng.rec.recomana.lupa.engine.KLDdistance;
import cat.tv3.eng.rec.recomana.lupa.engine.LupaItem;

public class LupaItemDistance {
	
	public LupaItemDistance() {	      
	}
	
	public double distance(LupaClusterItem x, LupaClusterItem y){			
		LupaItem Instance_x = new LupaItem();
		Instance_x.setWordCounts(x.getText_freq());
		Instance_x.setSize(x.getCount());	
		
		LupaItem Instance_y = new LupaItem();
		Instance_y.setWordCounts(y.getText_freq());
		Instance_y.setSize(y.getCount());	
		
		KLDdistance calculador = new KLDdistance(Instance_x,Instance_y);
		return calculador.distance();	
	}

	
}
