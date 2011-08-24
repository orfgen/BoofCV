/*
 * Copyright 2011 Peter Abeles
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package gecv.alg.feature.orientation;

import gecv.struct.image.ImageFloat32;
import org.junit.Test;


/**
 * @author Peter Abeles
 */
public class TestOrientationAverageHaarIntegral {
	double angleTol = 0.01;
	int r = 3;

	@Test
	public void standardUnweighted() {
		GenericOrientationIntegralTests<ImageFloat32> tests = new GenericOrientationIntegralTests<ImageFloat32>();

		OrientationAverageHaarIntegral<ImageFloat32> alg = new OrientationAverageHaarIntegral<ImageFloat32>(r,false);

		tests.setup(angleTol, r*2+1 , alg,ImageFloat32.class);
		tests.performAll();
	}

	@Test
	public void standardWeighted() {
		GenericOrientationIntegralTests<ImageFloat32> tests = new GenericOrientationIntegralTests<ImageFloat32>();

		OrientationAverageHaarIntegral<ImageFloat32> alg = new OrientationAverageHaarIntegral<ImageFloat32>(r,true);

		tests.setup(angleTol, r*2+1 ,alg,ImageFloat32.class);
		tests.performAll();
	}
}