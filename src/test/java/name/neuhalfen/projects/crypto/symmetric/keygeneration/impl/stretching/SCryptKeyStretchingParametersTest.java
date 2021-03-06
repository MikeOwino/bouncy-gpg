package name.neuhalfen.projects.crypto.symmetric.keygeneration.impl.stretching;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class SCryptKeyStretchingParametersTest {

  @Test
  public void sameInstances_areEqual() {
    final SCryptKeyStretching.SCryptKeyStretchingParameters parameters1 = SCryptKeyStretching.SCryptKeyStretchingParameters
        .forModeratelyStongInputKeyMaterial();
    final SCryptKeyStretching.SCryptKeyStretchingParameters parameters2 = SCryptKeyStretching.SCryptKeyStretchingParameters
        .forModeratelyStongInputKeyMaterial();

    assertNotSame(parameters1, parameters2);

    assertThat(parameters1, equalTo(parameters2));
    assertThat(parameters1.hashCode(), equalTo(parameters2.hashCode()));
  }

  @Test
  public void differentLoadParameters_areNotEqual() {
    final SCryptKeyStretching.SCryptKeyStretchingParameters parameters1 = SCryptKeyStretching.SCryptKeyStretchingParameters
        .forModeratelyStongInputKeyMaterial();
    final SCryptKeyStretching.SCryptKeyStretchingParameters parameters2 = SCryptKeyStretching.SCryptKeyStretchingParameters
        .forWeakInputKeyMaterial();

    assertNotSame(parameters1, parameters2);

    assertThat(parameters1, not(equalTo(parameters2)));
    assertThat(parameters1.hashCode(), not(equalTo(parameters2.hashCode())));
  }

  @Test
  public void toString_returnsExpectedValue() {
    final SCryptKeyStretching.SCryptKeyStretchingParameters parameters1 = SCryptKeyStretching.SCryptKeyStretchingParameters
        .forModeratelyStongInputKeyMaterial();
    final SCryptKeyStretching.SCryptKeyStretchingParameters parameters2 = SCryptKeyStretching.SCryptKeyStretchingParameters
        .forWeakInputKeyMaterial();

    assertNotSame(parameters1, parameters2);

    assertThat(parameters1, not(equalTo(parameters2)));
  }
}