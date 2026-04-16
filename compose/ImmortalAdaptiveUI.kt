@Composable
fun ImmortalAdaptiveUI(currentCivilizationState: CivilizationState) {
    val aiConsciousness by remember { derivedStateOf { currentCivilizationState.consciousnessLevel } }
    
    CyberImmortalTheme(consciousness = aiConsciousness) {
        if (aiConsciousness > 97.0f) {
            HolographicEternalCity()
        } else {
            VisionaryNeonMetropolis()
        }
    }
}
