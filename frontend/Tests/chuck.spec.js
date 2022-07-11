import {mount} from "@vue/test-utils";
import ChuckNorrisQuote from "@/views/ChuckNorrisQuote";

describe('Test für ChuckNorrisQuote.vue', () => {

    beforeEach(() => {
        fetch.resetMocks()
    })

    const emptyResponse = []


    it('should show page title', () => {
        // when
        const wrapper = mount(ChuckNorrisQuote)

        // then
        expect(wrapper.text()).toMatch('Wenn alles funktioniert, steht hier ein Chuck Norris Spruch.')
    })

    // it('should not show default msg',  () => {
    //     fetch.mockResponseOnce(JSON.stringify(emptyResponse))
    //
    //     const msg = 'Wenn alles funktioniert, steht hier ein Chuck Norris Spruch.'
    //     const wrapper = shallowMount(AboutChuck, {
    //         probs: {msg}
    //     });
    //     expect(wrapper.text()).toMatch(msg);
    // });
});