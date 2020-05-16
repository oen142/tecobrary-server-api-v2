import request from '@/utils/request'

export const getLibraryBooks = (query) => request({
    url: '/api/librarybook',
    method: 'get',
    params: Object.assign(query, {
        page: query.page
    })
})

export const createLibraryBook = (body) => request({
    url: '/api/librarybook',
    method: 'post',
    body: body
})